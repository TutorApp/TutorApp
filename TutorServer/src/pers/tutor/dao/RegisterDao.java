package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午7:09:27
    * 类说明
 */
public class RegisterDao {

	public int register(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		//检查用户名是否已存在
				String sql1 = "SELECT * from user WHERE username=? AND type=?";
				try {
					PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
					//传递参数
					preparedStatement1.setString(1,userEntity.getUsername());
					preparedStatement1.setInt(2,userEntity.getType());
					//执行SQL
					ResultSet resultSet = preparedStatement1.executeQuery();
					UserEntity userEn = null;
					if(resultSet.next()) {
						userEn = new UserEntity();
						userEn.setUsername(resultSet.getString("username"));
					}
					if(userEn != null) {
						return 2;
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
		String sql = "INSERT`user` (`username`, `password`,`type`) VALUES (?, ?, ?)";//sql增加语句
		//创建数据库操作
		//userEntity userEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,userEntity.getUsername());
			preparedStatement.setString(2,userEntity.getPassword());
			preparedStatement.setInt(3,userEntity.getType());
			//执行SQL
			int resultSet = preparedStatement.executeUpdate();
			System.out.print(resultSet);
		} catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

}
