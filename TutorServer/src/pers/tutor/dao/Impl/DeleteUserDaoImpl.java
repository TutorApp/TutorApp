package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.dao.DeleteUserDao;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����11:10:36
* ��˵��
*/
public class DeleteUserDaoImpl implements DeleteUserDao {

	@Override
	public int deleteUser(int id) {
		Connection connection = DBUtil.getConnection();//��������
		String sql = "DELETE FROM user WHERE id=?";
		
		PreparedStatement preparedStatement;
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			result = preparedStatement.executeUpdate();
			connection.close();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}
