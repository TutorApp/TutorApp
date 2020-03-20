package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.TeacherEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����7:26:04
    * ��˵��
 */
public class TeacherRegisterDao {

	public int register(TeacherEntity teacherEntity) {
		Connection connection = DBUtil.getConnection();//��������
		//����û����Ƿ��Ѵ���
		String sql1 = "SELECT * from teacher WHERE username=?";
		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			//���ݲ���
			preparedStatement1.setString(1,teacherEntity.getUsername());
			//ִ��SQL
			ResultSet resultSet = preparedStatement1.executeQuery();
			TeacherEntity teacherEn = null;
			if(resultSet.next()) {
				teacherEn = new TeacherEntity();
				teacherEn.setUsername(resultSet.getString("username"));
			}
			if(teacherEn != null) {
				return 2;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		String sql = "INSERT`teacher` (`username`, `password`) VALUES (?, ?)";//sql�������
		//�������ݿ����
		//StudentEntity studentEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,teacherEntity.getUsername());
			preparedStatement.setString(2,teacherEntity.getPassword());
			//ִ��SQL
			preparedStatement.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

}
