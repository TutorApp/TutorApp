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
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:10:30
* ��˵�� �����б�
*/
public class DemandListDao {

	public List<DemandEntity> demandList() {
		//1����������
		Connection conn = DBUtil.getConnection();
		//�������ݿ����
		String sql = "SELECT * FROM demand WHERE 'state' = 0 OR 'state' = 1";
		DemandEntity demandEntity = null;
		List<DemandEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			//ִ��sql
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				demandEntity = new DemandEntity();
				demandEntity.setTeacher_id(resultSet.getInt("teacher_id"));
				demandEntity.setDate(resultSet.getString("date"));
				demandEntity.setEnd_time(resultSet.getString("end_time"));
				demandEntity.setGrade(resultSet.getString("grade"));
				demandEntity.setId(resultSet.getInt("id"));
				demandEntity.setName(resultSet.getString("name"));
				demandEntity.setOther(resultSet.getString("other"));
				demandEntity.setTeacher_phone(resultSet.getString("teacher_phone"));
				demandEntity.setSalary(resultSet.getInt("salary"));
				demandEntity.setStart_time(resultSet.getString("start_time"));
				demandEntity.setState(resultSet.getInt("state"));
				demandEntity.setSubject(resultSet.getString("subject"));
				demandEntity.setTeacher_address(resultSet.getString("teacher_address"));
				
				//��ȡ���ĵ�������װ��list��
				list.add(demandEntity);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
