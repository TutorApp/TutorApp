package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.dao.RegisterDao;
import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:40:37
* ��˵��
*/
public class RegisterDaoImpl implements RegisterDao {

	@Override
	public int register(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//��������
		int result = -1;
		//����û����Ƿ��Ѵ���
		String sql1 = "SELECT * from user WHERE username=?";//sql��ѯ���
		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			//���ݲ���
			preparedStatement1.setString(1,userEntity.getUsername());
			//ִ��SQL
			ResultSet resultSet = preparedStatement1.executeQuery();
			UserEntity userEn = null;
			if(resultSet.next()) {
				userEn = new UserEntity();
				userEn.setUsername(resultSet.getString("username"));
			}
			if(userEn != null) {
				connection.close();
				return -2;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "INSERT`user` (`username`, `password`,`type`) VALUES (?, ?, ?)";//sql�������
		//�������ݿ����
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,userEntity.getUsername());
			preparedStatement.setString(2,userEntity.getPassword());
			preparedStatement.setInt(3,userEntity.getType());
			//ִ��SQL
			result = preparedStatement.executeUpdate();
			System.out.println(result);
		} catch(SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
