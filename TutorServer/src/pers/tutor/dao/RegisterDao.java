package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����7:09:27
    * ��˵��
 */
public class RegisterDao {

	public int register(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//��������
		
		//����û����Ƿ��Ѵ���
				String sql1 = "SELECT * from user WHERE username=? AND type=?";
				try {
					PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
					//���ݲ���
					preparedStatement1.setString(1,userEntity.getUsername());
					preparedStatement1.setInt(2,userEntity.getType());
					//ִ��SQL
					ResultSet resultSet = preparedStatement1.executeQuery();
					UserEntity userEn = null;
					if(resultSet.next()) {
						userEn = new UserEntity();
						userEn.setUsername(resultSet.getString("username"));
					}
					if(userEn != null) {
						return 2;
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
		String sql = "INSERT`user` (`username`, `password`,`type`) VALUES (?, ?, ?)";//sql�������
		//�������ݿ����
		//userEntity userEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,userEntity.getUsername());
			preparedStatement.setString(2,userEntity.getPassword());
			preparedStatement.setInt(3,userEntity.getType());
			//ִ��SQL
			int resultSet = preparedStatement.executeUpdate();
			System.out.print(resultSet);
		} catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

}
