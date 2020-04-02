package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:10:30
* ��˵�� 	��ʦ�û�ȷ�϶������ݷ��ʲ�
*/
public class SureOrderDao {

	public int sureOrder(int id) {
		
		Connection connection = DBUtil.getConnection();//��������
		
		String sql = "UPDATE `order` SET state = 4 WHERE id = ?";//sql�������
		//�������ݿ����
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setInt(1,id);
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
