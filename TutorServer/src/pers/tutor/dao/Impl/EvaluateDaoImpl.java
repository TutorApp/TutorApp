package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.dao.EvaluateDao;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:02:29
* ��˵��
*/
public class EvaluateDaoImpl implements EvaluateDao {

	@Override
	public int evaluate(EvaluateEntity evaluateEntity) {
		Connection connection = DBUtil.getConnection();//��������
		String sql = "INSERT`evaluation` (`evaluation`, `user_id`,`who_id`) VALUES (?,?,?)";
		//SQL�������
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, evaluateEntity.getEvaluation());
			preparedStatement.setInt(2, evaluateEntity.getUser_id());
			preparedStatement.setInt(3, evaluateEntity.getWho_id());
			//ִ��
			int result = preparedStatement.executeUpdate();
			connection.close();
			if(result == 1) {
				return 0;
			}else {
				return -1;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
		
	}

}
