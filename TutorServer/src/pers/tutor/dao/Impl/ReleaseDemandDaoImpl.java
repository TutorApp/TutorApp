package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.dao.ReleaseDemandDao;
import pers.tutor.entity.DemandEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:45:11
* 类说明
*/
public class ReleaseDemandDaoImpl implements ReleaseDemandDao {

	@Override
	public int release(DemandEntity demandEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "INSERT`demand` (`subject`, `grade`,`name`,`teacher_phone`, `teacher_id`,`state`, `salary`,`teacher_address`,`other`, `start_time`,`end_time`,`date`) VALUES (?,?, ?,?, ?, ?,?, ?, ?,?, ?, ?)";
		//SQL增加语句
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, demandEntity.getSubject());
			preparedStatement.setString(2,demandEntity.getGrade());
			preparedStatement.setString(3, demandEntity.getName());
			preparedStatement.setString(4, demandEntity.getTeacher_phone());
			preparedStatement.setInt(5, demandEntity.getTeacher_id());
			preparedStatement.setInt(6, 0);
			preparedStatement.setInt(7, demandEntity.getSalary());
			preparedStatement.setString(8, demandEntity.getTeacher_address());
			preparedStatement.setString(9, demandEntity.getOther());
			preparedStatement.setString(10, demandEntity.getStart_time());
			preparedStatement.setString(11, demandEntity.getEnd_time());
			preparedStatement.setString(12, demandEntity.getDate());
			
			int result = preparedStatement.executeUpdate();
			connection.close();
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

	@Override
	public int getTeacherId(String username) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "SELECT * from user WHERE username=? AND type=?";//sql查询语句
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,username);
			preparedStatement.setInt(2,0);
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
