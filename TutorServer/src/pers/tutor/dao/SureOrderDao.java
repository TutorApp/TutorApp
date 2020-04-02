package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明 	教师用户确认订单数据访问层
*/
public class SureOrderDao {

	public int sureOrder(int id) {
		
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "UPDATE `order` SET state = 4 WHERE id = ?";//sql增加语句
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setInt(1,id);
			//执行SQL
			int resultSet = preparedStatement.executeUpdate();
			
			if(resultSet != 0) {
				connection.close();
				return 0;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
