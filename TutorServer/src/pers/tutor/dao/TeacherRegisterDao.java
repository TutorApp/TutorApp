package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pers.tutor.entity.TeacherEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午7:26:04
    * 类说明
 */
public class TeacherRegisterDao {

	public int register(TeacherEntity teacherEntity) {
		Connection connection = DBUtil.getConnection();//创建连接
		//检查用户名是否已存在
		String sql1 = "SELECT * from teacher WHERE username=?";
		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			//传递参数
			preparedStatement1.setString(1,teacherEntity.getUsername());
			//执行SQL
			ResultSet resultSet = preparedStatement1.executeQuery();
			TeacherEntity teacherEn = null;
			if(resultSet.next()) {
				teacherEn = new TeacherEntity();
				teacherEn.setUsername(resultSet.getString("username"));
			}
			if(teacherEn != null) {
				return 2;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		String sql = "INSERT`teacher` (`username`, `password`) VALUES (?, ?)";//sql增加语句
		//创建数据库操作
		//StudentEntity studentEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,teacherEntity.getUsername());
			preparedStatement.setString(2,teacherEntity.getPassword());
			//执行SQL
			preparedStatement.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

}
