package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.dao.RevodeDemandDao;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:51:13
* ��˵��
*/
public class RevodeDemandDaoImpl implements RevodeDemandDao {

	@Override
	public int revodeDemand(int id) {
		
		Connection connection = DBUtil.getConnection();//��������
		
		String sql = "SELECT state FROM `demand` WHERE id = ?";
		String sql1 = "UPDATE `demand` SET state = 3 WHERE id = ?";
		//�������ݿ����
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			//���ݲ���
			preparedStatement.setInt(1,id);
			preparedStatement1.setInt(1,id);
			int result = 0;
			ResultSet res = preparedStatement.executeQuery();
			while(res.next()) {
				//ִ��SQL 
				if(res.getInt("state") != 2 && res.getInt("state") != 3) {
				result = preparedStatement1.executeUpdate();
				}
			}			
			if(result != 0) {
				connection.close();
				return 0;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
