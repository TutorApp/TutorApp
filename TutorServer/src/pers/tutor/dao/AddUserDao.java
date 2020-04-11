package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��20�� ����2:26:58
* ��˵��	�û���¼ϵͳ���ݷ��ʲ�
*/
public class AddUserDao {

	public int addUser(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//��������
		String sql = "INSERT INTO `tutor_app`.`user` (`username`, `password`, `type`, `phone`, `sex`, `age`) VALUES (?, ?, ?, ?, ?, ?)";//sql�������
		String sql1 = "SELECT * FROM user WHERE username=?";
		
		PreparedStatement preparedStatement;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1,userEntity.getUsername());
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//�������ݿ����
		
		int result = 0;
		UserEntity userEn = null;
		try {
			while(resultSet.next()) {
				userEn = new UserEntity();
				userEn.setUsername(resultSet.getString("username"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(userEn == null) {
			try {
				preparedStatement = connection.prepareStatement(sql);
				//���ݲ���
				preparedStatement.setString(1,userEntity.getUsername());
				preparedStatement.setString(2,userEntity.getPassword());
				preparedStatement.setInt(3, userEntity.getType());
				preparedStatement.setString(4, userEntity.getPhone());
				preparedStatement.setInt(5, userEntity.getSex());
				preparedStatement.setInt(6, userEntity.getAge());
				//ִ��SQL
				result = preparedStatement.executeUpdate();
				
				//ȡ������ֵ
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}else {
			return -1;
		}
		return result;
	}
}
