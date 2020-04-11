package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��3�� ����4:20:00
    * ��˵��	�û��������ݷ��ʲ�
 */
public class EvaluateDao {

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
