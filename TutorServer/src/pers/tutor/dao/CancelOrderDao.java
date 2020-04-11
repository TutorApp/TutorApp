package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��2�� ����8:17:28
    * ��˵�� ѧ��ȡ���������ݷ��ʲ�
 */
public class CancelOrderDao {

	public int cancelOrder(int id) {
		
		Connection connection = DBUtil.getConnection();//��������
		
		String sql = "UPDATE `order` SET state = 0 WHERE id = ?";//sql�������
		String sql1 = "SELECT demand_id FROM `order` WHERE id = ?";
		String sql2 = "UPDATE `demand` SET state = 1 WHERE id = ?";
		//�������ݿ����
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
			//���ݲ���
			preparedStatement.setInt(1,id);
			preparedStatement1.setInt(1,id);
			ResultSet result = preparedStatement1.executeQuery();
			while(result.next()) {
				preparedStatement2.setInt(1,result.getInt("demand_id"));
				preparedStatement2.executeUpdate();
			}
			
			//ִ��SQL
			int resultSet = preparedStatement.executeUpdate();
			
			if(resultSet != 0) {
				connection.close();
				return 0;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
