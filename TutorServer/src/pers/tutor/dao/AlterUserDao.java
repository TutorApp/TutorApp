package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午3:18:03
    * 类说明	管理员修改用户数据操作层
 */
public class AlterUserDao {

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
