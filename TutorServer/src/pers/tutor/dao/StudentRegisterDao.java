package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.StudentEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����7:09:27
    * ��˵��
 */
public class StudentRegisterDao {

	public int register(StudentEntity studentEntity) {
		Connection connection = DBUtil.getConnection();//��������
		
		//����û����Ƿ��Ѵ���
				String sql1 = "SELECT * from student WHERE username=?";
				try {
					PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
					//���ݲ���
					preparedStatement1.setString(1,studentEntity.getUsername());
					//ִ��SQL
					ResultSet resultSet = preparedStatement1.executeQuery();
					StudentEntity studentEn = null;
					if(resultSet.next()) {
						studentEn = new StudentEntity();
						studentEn.setUsername(resultSet.getString("username"));
					}
					if(studentEn != null) {
						return 2;
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
		String sql = "INSERT`student` (`username`, `password`) VALUES (?, ?)";//sql�������
		//�������ݿ����
		//StudentEntity studentEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,studentEntity.getUsername());
			preparedStatement.setString(2,studentEntity.getPassword());
			//ִ��SQL
			int resultSet = preparedStatement.executeUpdate();
			System.out.print(resultSet);
		} catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

}
