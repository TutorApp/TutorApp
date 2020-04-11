package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.entity.DemandEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��7�� ����8:34:18
    * ��˵��	��ʦ�û��鿴�ѷ����Ľ�ѧ��Ϣ���ݷ��ʲ�
 */
public class MyReleaseDao {

	public List<DemandEntity> getMyRelease(int id) {
		//1����������
		Connection conn = DBUtil.getConnection();
		//�������ݿ����
		String sql = "SELECT * FROM `demand` WHERE id = ?";//SQL��ѯ���
		DemandEntity demandEntity = null;
		List<DemandEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			//ִ��sql
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				demandEntity = new DemandEntity();
				demandEntity.setId(resultSet.getInt("id"));
				demandEntity.setSubject(resultSet.getString("subject"));
				demandEntity.setGrade(resultSet.getString("grade"));
				demandEntity.setTeacher_phone(resultSet.getString("teacher_phone"));
				demandEntity.setState(resultSet.getInt("state"));
				demandEntity.setSalary(resultSet.getInt("salary"));
				demandEntity.setTeacher_address(resultSet.getString("teacher_address"));
				demandEntity.setOther(resultSet.getString("other"));
				demandEntity.setStart_time(resultSet.getString("start_time"));
				demandEntity.setDate(resultSet.getString("date"));
				demandEntity.setEnd_time(resultSet.getString("end_time"));

				
				//��ȡ���ĵ�������װ��list��
				list.add(demandEntity);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int getUserId(String username) {
		Connection connection = DBUtil.getConnection();//��������
		
		String sql = "SELECT id from user WHERE username=?";//sql��ѯ���
		//�������ݿ����
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			int result = -1;
			while(resultSet.next()) {
				result = resultSet.getInt("id");
			}
			connection.close();
			return result;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
