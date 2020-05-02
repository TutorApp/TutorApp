package pers.tutor.dao.Impl;

import pers.tutor.dao.AddInformationDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����9:13:27
* ��˵��
*/
public class AddInformationDaoImpl implements AddInformationDao {

	@Override
	public int addInformation(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//��������
		
		//����û����Ƿ��Ѵ���
		String sql = "UPDATE `user` SET `phone`=?, `sex`=?, `age`=?, `net_name`=?, `address`=? WHERE (`username` = ?)";//sql��ѯ���
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,userEntity.getPhone());
			preparedStatement.setInt(2,userEntity.getSex());
			preparedStatement.setInt(3, userEntity.getAge());
			preparedStatement.setString(4,userEntity.getNet_name());
			preparedStatement.setString(5, userEntity.getAddress());
			preparedStatement.setString(6, userEntity.getUsername());

			//ִ��SQL
			int result = preparedStatement.executeUpdate();
			connection.close();
			if(result != 0) {	
				return 0;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}

	return -1;
	}

}
