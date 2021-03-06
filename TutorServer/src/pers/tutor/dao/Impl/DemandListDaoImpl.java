package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.dao.DemandListDao;
import pers.tutor.entity.DemandEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午9:50:16
* 类说明
*/
public class DemandListDaoImpl implements DemandListDao {

	@Override
	public List<DemandEntity> demandList()  {
		//1、创建连接
		Connection conn = DBUtil.getConnection();
		//创建数据库操作
		String sql = "SELECT * FROM demand WHERE state != 2";
		DemandEntity demandEntity = null;
		List<DemandEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			//执行sql
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
				
				//将取到的单条数据装入list中
				list.add(demandEntity);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
