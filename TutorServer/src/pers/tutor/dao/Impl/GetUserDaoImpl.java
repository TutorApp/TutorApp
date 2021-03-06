package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.dao.GetUserDao;
import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:13:38
* 类说明
*/
public class GetUserDaoImpl implements GetUserDao {

	@Override
	public List<UserEntity> getUser(int type) {
		//1、创建连接
		Connection conn = DBUtil.getConnection();
		//创建数据库操作
		String sql = "SELECT * FROM user WHERE type=?";
		UserEntity userEntity = null;
		List<UserEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, type);
			//执行sql
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				userEntity = new UserEntity();
				userEntity.setId(resultSet.getInt("id"));
				userEntity.setUsername(resultSet.getString("username"));
				userEntity.setSex(resultSet.getInt("sex"));
				userEntity.setAge(resultSet.getInt("age"));
				userEntity.setPhone(resultSet.getString("phone"));
				userEntity.setAddress(resultSet.getString("address"));
				userEntity.setNet_name(resultSet.getString("net_name"));

				
				//将取到的单条数据装入list中
				list.add(userEntity);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
