package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.StudentEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月20日 下午2:26:58
* 持久层
*/
public class StudentLoginDao {

	public int login(String username, String password) {
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "SELECT * from student WHERE username=? AND password=?";//sql查询语句
		//创建数据库操作
		StudentEntity studentEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			//执行SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			
			//取出返回值
			if(resultSet.next()) {
				
				studentEntity = new StudentEntity();
				studentEntity.setId(resultSet.getInt("id"));
				studentEntity.setUsername(resultSet.getString("username"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(studentEntity == null) {
			return 1;
		}else {
			return 0;
		}
	}

}
