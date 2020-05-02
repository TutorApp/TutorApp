package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.dao.AlterUserDao;
import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:07:34
* 类说明
*/
public class AlterUserDaoImpl implements AlterUserDao {

	@Override
	public int alterUser(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		//检查用户名是否已存在
		String sql = "UPDATE `user` SET `phone`=?, `sex`=?, `age`=?, `net_name`=?, `address`=?, `username`=? WHERE (`id` = ?)";//sql更新语句
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,userEntity.getPhone());
			preparedStatement.setInt(2,userEntity.getSex());
			preparedStatement.setInt(3, userEntity.getAge());
			preparedStatement.setString(4,userEntity.getNet_name());
			preparedStatement.setString(5, userEntity.getAddress());
			preparedStatement.setString(6, userEntity.getUsername());
			preparedStatement.setInt(7, userEntity.getId());

			//执行SQL
			int result = preparedStatement.executeUpdate();
			connection.close();
			if(result != 0) {	
				return 0;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}

	return -1;
	}

}
