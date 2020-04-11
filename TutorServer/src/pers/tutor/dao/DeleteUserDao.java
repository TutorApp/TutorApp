package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月6日 下午9:14:52
    * 类说明	管理员删除用户数据访问层
 */
public class DeleteUserDao {

	public int deleteUser(int id) {
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "DELETE FROM user WHERE id=?";
		
		PreparedStatement preparedStatement;
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			result = preparedStatement.executeUpdate();
			connection.close();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
