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
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午8:34:18
    * 类说明	教师用户查看已发布的教学信息数据访问层
 */
public class MyReleaseDao {

	public List<DemandEntity> getMyRelease(int id) {
		//1、创建连接
		Connection conn = DBUtil.getConnection();
		//创建数据库操作
		String sql = "SELECT * FROM `demand` WHERE id = ?";//SQL查询语句
		DemandEntity demandEntity = null;
		List<DemandEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			//执行sql
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

				
				//将取到的单条数据装入list中
				list.add(demandEntity);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int getUserId(String username) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "SELECT id from user WHERE username=?";//sql查询语句
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,username);
			//执行SQL
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
