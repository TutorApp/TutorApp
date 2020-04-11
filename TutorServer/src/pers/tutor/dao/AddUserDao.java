package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月20日 下午2:26:58
* 类说明	用户登录系统数据访问层
*/
public class AddUserDao {

	public int addUser(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "INSERT INTO `tutor_app`.`user` (`username`, `password`, `type`, `phone`, `sex`, `age`) VALUES (?, ?, ?, ?, ?, ?)";//sql增加语句
		String sql1 = "SELECT * FROM user WHERE username=?";
		
		PreparedStatement preparedStatement;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1,userEntity.getUsername());
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//创建数据库操作
		
		int result = 0;
		UserEntity userEn = null;
		try {
			while(resultSet.next()) {
				userEn = new UserEntity();
				userEn.setUsername(resultSet.getString("username"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(userEn == null) {
			try {
				preparedStatement = connection.prepareStatement(sql);
				//传递参数
				preparedStatement.setString(1,userEntity.getUsername());
				preparedStatement.setString(2,userEntity.getPassword());
				preparedStatement.setInt(3, userEntity.getType());
				preparedStatement.setString(4, userEntity.getPhone());
				preparedStatement.setInt(5, userEntity.getSex());
				preparedStatement.setInt(6, userEntity.getAge());
				//执行SQL
				result = preparedStatement.executeUpdate();
				
				//取出返回值
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}else {
			return -1;
		}
		return result;
	}
}
