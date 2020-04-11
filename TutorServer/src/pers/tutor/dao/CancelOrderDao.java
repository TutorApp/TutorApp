package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月2日 下午8:17:28
    * 类说明 学生取消订单数据访问层
 */
public class CancelOrderDao {

	public int cancelOrder(int id) {
		
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "UPDATE `order` SET state = 0 WHERE id = ?";//sql增加语句
		String sql1 = "SELECT demand_id FROM `order` WHERE id = ?";
		String sql2 = "UPDATE `demand` SET state = 1 WHERE id = ?";
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
			//传递参数
			preparedStatement.setInt(1,id);
			preparedStatement1.setInt(1,id);
			ResultSet result = preparedStatement1.executeQuery();
			while(result.next()) {
				preparedStatement2.setInt(1,result.getInt("demand_id"));
				preparedStatement2.executeUpdate();
			}
			
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
