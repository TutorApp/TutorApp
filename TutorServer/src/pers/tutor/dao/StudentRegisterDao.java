package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.StudentEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午7:09:27
    * 类说明
 */
public class StudentRegisterDao {

	public int register(StudentEntity studentEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		
		//检查用户名是否已存在
				String sql1 = "SELECT * from student WHERE username=?";
				try {
					PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
					//传递参数
					preparedStatement1.setString(1,studentEntity.getUsername());
					//执行SQL
					ResultSet resultSet = preparedStatement1.executeQuery();
					StudentEntity studentEn = null;
					if(resultSet.next()) {
						studentEn = new StudentEntity();
						studentEn.setUsername(resultSet.getString("username"));
					}
					if(studentEn != null) {
						return 2;
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
		String sql = "INSERT`student` (`username`, `password`) VALUES (?, ?)";//sql增加语句
		//创建数据库操作
		//StudentEntity studentEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,studentEntity.getUsername());
			preparedStatement.setString(2,studentEntity.getPassword());
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
