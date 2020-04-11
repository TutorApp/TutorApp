package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午9:54:21
    * 类说明	个人信息维护数据访问层
 */
public class AddInformationDao {

	public int addInformation(UserEntity userEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		//检查用户名是否已存在
		String sql = "UPDATE `user` SET `phone`=?, `sex`=?, `age`=?, `net_name`=?, `address`=? WHERE (`username` = ?)";//sql查询语句
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,userEntity.getPhone());
			preparedStatement.setInt(2,userEntity.getSex());
			preparedStatement.setInt(3, userEntity.getAge());
			preparedStatement.setString(4,userEntity.getNet_name());
			preparedStatement.setString(5, userEntity.getAddress());
			preparedStatement.setString(6, userEntity.getUsername());

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
