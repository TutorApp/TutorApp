package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.dao.RegisterDao;
import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:40:37
* 类说明
*/
public class RegisterDaoImpl implements RegisterDao {

	@Override
	public int register(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		int result = -1;
		//检查用户名是否已存在
		String sql1 = "SELECT * from user WHERE username=?";//sql查询语句
		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			//传递参数
			preparedStatement1.setString(1,userEntity.getUsername());
			//执行SQL
			ResultSet resultSet = preparedStatement1.executeQuery();
			UserEntity userEn = null;
			if(resultSet.next()) {
				userEn = new UserEntity();
				userEn.setUsername(resultSet.getString("username"));
			}
			if(userEn != null) {
				connection.close();
				return -2;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "INSERT`user` (`username`, `password`,`type`) VALUES (?, ?, ?)";//sql增加语句
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,userEntity.getUsername());
			preparedStatement.setString(2,userEntity.getPassword());
			preparedStatement.setInt(3,userEntity.getType());
			//执行SQL
			result = preparedStatement.executeUpdate();
			System.out.println(result);
		} catch(SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
