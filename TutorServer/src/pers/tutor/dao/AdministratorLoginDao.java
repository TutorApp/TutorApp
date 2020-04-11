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
 * @version ����ʱ��		2020��4��5�� ����3:38:00
    * ��˵��	����Ա��¼��ʾ��
 */
public class AdministratorLoginDao {

	public int administratorLogin(String username, String password) {
		Connection connection = DBUtil.getConnection();//��������
		String sql = "SELECT * from administrator WHERE username=? AND password=?";//sql��ѯ���
		//�������ݿ����
		UserEntity userEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//ȡ������ֵ
			if(resultSet.next()) {
				userEntity = new UserEntity();
				userEntity.setId(resultSet.getInt("id"));
				userEntity.setUsername(resultSet.getString("username"));
			}
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(userEntity == null) {
			return 1;
		}else {
			return 0;
		}
	}

}