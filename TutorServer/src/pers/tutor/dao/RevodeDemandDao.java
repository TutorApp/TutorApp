package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����7:28:26
    * ��˵��	��ʦ�û������ѷ����Ľ�ѧ��Ϣ���ݷ��ʲ�
 */
public class RevodeDemandDao {

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
