package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.TeacherEntity;
import pers.tutor.util.DBUtil;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��20�� ����2:26:58
* �־ò�
*/
public class TeacherLoginDao {

	public int login(String username, String password) {
		Connection connection = DBUtil.getConnection();//��������
		String sql = "SELECT * from teacher WHERE username=? AND password=?";//sql��ѯ���
		//�������ݿ����
		TeacherEntity teacherEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//ȡ������ֵ
			if(resultSet.next()) {
				teacherEntity = new TeacherEntity();
				teacherEntity.setId(resultSet.getInt("id"));
				teacherEntity.setUsername(resultSet.getString("username"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(teacherEntity == null) {
			return 1;
		}else {
			return 0;
		}
	}

}
