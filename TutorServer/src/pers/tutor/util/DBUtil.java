package pers.tutor.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	public static final String driver="com.mysql.jdbc.Driver";
	public static final String url="jdbc:mysql://localhost:3306/tutor_app";
	public static final String user="root";
	public static final String password="ys980102";
	
	public static Connection connection=null;
	public static PreparedStatement preparedStatement=null;
	public static ResultSet resultSet=null;
	
	public static Connection getConnection(){
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("没有找到驱动");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("获取链接失败");
		}
		return connection;
	}
	
	public static int update(String sql,Object... objects ) {
		int result=0;
		connection=getConnection();
		try {
			preparedStatement=connection.prepareStatement(sql);
			if (objects!=null) {
				for(int i=0;i<objects.length;i++){
					preparedStatement.setObject(i+1, objects[i]);
				}
			}
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(preparedStatement, connection);
		}
		return result;
	}
	public static ResultSet querry(String sql) {
		connection=getConnection();
		try {
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static void  close(PreparedStatement preparedStatement,Connection connection) {
		close(preparedStatement);
		close(connection);
	}
	public static void  close(ResultSet resultSet,PreparedStatement preparedStatement,Connection connection) {
		close(preparedStatement);
		close(connection);
		close(resultSet);
	}
	public static void close(Connection condition){
			try {
				if (condition !=null) {
				condition.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
		}
	}
	public static void close(PreparedStatement preparedStatement){
		try {
			if (preparedStatement !=null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
	}
}
	public static void close(ResultSet resultSet){
		try {
			if (resultSet !=null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
	}
}
}
