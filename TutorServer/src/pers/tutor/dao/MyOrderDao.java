package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.entity.OrderEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明	用户查看订单数据访问层
*/
public class MyOrderDao {

	public List<OrderEntity> getMyOrder(int id) {
		//1、创建连接
		Connection conn = DBUtil.getConnection();
		//创建数据库操作
		String sql = "SELECT * FROM `order` WHERE teacher_id = ? OR student_id = ?";//SQL查询语句
		OrderEntity orderEntity = null;
		List<OrderEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, id);
			//执行sql
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				orderEntity = new OrderEntity();
				orderEntity.setStudent_id(resultSet.getInt("student_id"));
				orderEntity.setStudent_phone(resultSet.getString("student_phone"));
				orderEntity.setStudent_address(resultSet.getString("student_address"));
				orderEntity.setTeacher_id(resultSet.getInt("teacher_id"));
				orderEntity.setDate(resultSet.getString("date"));
				orderEntity.setEnd_time(resultSet.getString("end_time"));
				orderEntity.setGrade(resultSet.getString("grade"));
				orderEntity.setId(resultSet.getInt("id"));
				orderEntity.setTeacher_name(resultSet.getString("teacher_name"));
				orderEntity.setOther(resultSet.getString("other"));
				orderEntity.setTeacher_phone(resultSet.getString("teacher_phone"));
				orderEntity.setSalary(resultSet.getInt("salary"));
				orderEntity.setStart_time(resultSet.getString("start_time"));
				orderEntity.setState(resultSet.getInt("state"));
				orderEntity.setSubject(resultSet.getString("subject"));
				orderEntity.setTeacher_address(resultSet.getString("teacher_address"));
				orderEntity.setStudent_name(resultSet.getString("student_name"));
				
				//将取到的单条数据装入list中
				list.add(orderEntity);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			System.out.println(list.size());
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
