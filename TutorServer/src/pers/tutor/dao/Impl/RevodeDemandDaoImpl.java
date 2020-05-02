package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.dao.RevodeDemandDao;
import pers.tutor.util.DBUtil;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:51:13
* 类说明
*/
public class RevodeDemandDaoImpl implements RevodeDemandDao {

	@Override
	public int revodeDemand(int id) {
		
		Connection connection = DBUtil.getConnection();//创建连接
		
		String sql = "SELECT state FROM `demand` WHERE id = ?";
		String sql1 = "UPDATE `demand` SET state = 3 WHERE id = ?";
		//创建数据库操作
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			//传递参数
			preparedStatement.setInt(1,id);
			preparedStatement1.setInt(1,id);
			int result = 0;
			ResultSet res = preparedStatement.executeQuery();
			while(res.next()) {
				//执行SQL 
				if(res.getInt("state") != 2 && res.getInt("state") != 3) {
				result = preparedStatement1.executeUpdate();
				}
			}			
			if(result != 0) {
				connection.close();
				return 0;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
