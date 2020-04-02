package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明	学生用户下单数据访问层
*/
public class OrderDao {

	public int getStudentId(String username) {
		
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "SELECT * from user WHERE username=?";//sql查询语句
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,username);
			//执行SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			int result = -1;
			if(resultSet.next()) {
				result =  resultSet.getInt("id");
			}
			connection.close();
			return result;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public int order(OrderModel orderModel,DemandEntity demandEntity) {
		
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "INSERT`order` (`subject`, `grade`,`teacher_name`,`teacher_phone`, `teacher_id`,`state`, `salary`,`teacher_address`,`other`," + 
				"`start_time`,`end_time`,`date`,`student_id`,`student_phone`,`student_address`,`student_name`)VALUES (?,?,?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?)";
		String sql1 = "UPDATE demand SET state = 2 WHERE id = ?";//SQL增加语句
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			PreparedStatement pre = connection.prepareStatement(sql1);
			pre.setInt(1, demandEntity.getId());
			preparedStatement.setString(1, demandEntity.getSubject());
			preparedStatement.setString(2,demandEntity.getGrade());
			preparedStatement.setString(3, demandEntity.getName());
			preparedStatement.setString(4, demandEntity.getTeacher_phone());
			preparedStatement.setInt(5, demandEntity.getTeacher_id());
			preparedStatement.setInt(6, 2);
			preparedStatement.setInt(7, demandEntity.getSalary());
			preparedStatement.setString(8, demandEntity.getTeacher_address());
			preparedStatement.setString(9, demandEntity.getOther());
			preparedStatement.setString(10, demandEntity.getStart_time());
			preparedStatement.setString(11, demandEntity.getEnd_time());
			preparedStatement.setString(12, demandEntity.getDate());
			preparedStatement.setInt(13, orderModel.getStudent_id());
			preparedStatement.setString(14,orderModel.getStudent_phone());
			preparedStatement.setString(15, orderModel.getStudent_address());
			preparedStatement.setString(16,orderModel.getStudent_name());
			
			
			int result = preparedStatement.executeUpdate();
			int re = pre.executeUpdate();
			connection.close();
			if(result == 1 && re != 0) {
				return 0;
			}else {
				return -1;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
	}

	public DemandEntity demandInfo(int id) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "SELECT * from demand WHERE id=?";//sql查询语句
		//创建数据库操作
		DemandEntity demandEntity = new DemandEntity();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setInt(1,id);
			//执行SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				demandEntity.setId(resultSet.getInt("id"));
				demandEntity.setGrade(resultSet.getString("grade"));
				demandEntity.setSubject(resultSet.getString("subject"));
				demandEntity.setState(resultSet.getInt("State"));
				demandEntity.setSalary(resultSet.getInt("salary"));
				demandEntity.setStart_time(resultSet.getString("start_time"));
				demandEntity.setEnd_time(resultSet.getString("end_time"));
				demandEntity.setName(resultSet.getString("name"));
				demandEntity.setTeacher_address(resultSet.getString("teacher_address"));
				demandEntity.setTeacher_id(resultSet.getInt("teacher_id"));
				demandEntity.setTeacher_phone(resultSet.getString("teacher_phone"));
				demandEntity.setOther(resultSet.getString("other"));
				demandEntity.setDate(resultSet.getString("date"));
			}
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return demandEntity;
	}


}
