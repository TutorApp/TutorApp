package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.DemandEntity;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:10:30
* ��˵��
*/
public class ReleaseDemandDao {

	public int release(DemandEntity demandEntity) {
		Connection connection = DBUtil.getConnection();//��������
		String sql = "INSERT`demand` (`subject`, `grade`,`name`,`phone`, `teacher_id`,`state`, `salary`,`teacher_address`,`other`, `start_time`,`end_time`,`date`) VALUES (?,?, ?,?, ?, ?,?, ?, ?,?, ?, ?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, demandEntity.getSubject());
			preparedStatement.setString(2,demandEntity.getGrade());
			preparedStatement.setString(3, demandEntity.getName());
			preparedStatement.setString(4, demandEntity.getPhone());
			preparedStatement.setInt(5, demandEntity.getTeacher_id());
			preparedStatement.setInt(6, 0);
			preparedStatement.setInt(7, demandEntity.getSalary());
			preparedStatement.setString(8, demandEntity.getTeacher_address());
			preparedStatement.setString(9, demandEntity.getOther());
			preparedStatement.setString(10, demandEntity.getStart_time());
			preparedStatement.setString(11, demandEntity.getEnd_time());
			preparedStatement.setString(12, demandEntity.getDate());
			
			int result = preparedStatement.executeUpdate();
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

	public int getTeacherId(String username) {
		Connection connection = DBUtil.getConnection();//��������
		
		String sql = "SELECT * from user WHERE username=? AND type=?";//sql�������
		//�������ݿ����
		//userEntity userEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			preparedStatement.setInt(2,0);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				return resultSet.getInt("id");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}