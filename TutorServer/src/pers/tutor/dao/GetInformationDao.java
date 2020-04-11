package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午10:42:07
    * 类说明	查看个人信息数据访问层
 */
public class GetInformationDao {

	public List<EvaluateEntity> getEvaluation(String username) {
		//获取评价
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "SELECT evaluation.* FROM evaluation INNER JOIN user ON evaluation.who_id=`user`.id Where username = ?";//sql查询语句
		//创建数据库操作
		EvaluateEntity evaluateEntity = null;
		List<EvaluateEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,username);
			//执行SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//取出返回值
			while(resultSet.next()) {
				evaluateEntity = new EvaluateEntity();
				evaluateEntity.setEvaluation(resultSet.getString("evaluation"));;
				evaluateEntity.setUser_id(resultSet.getInt("user_id"));
				evaluateEntity.setId(resultSet.getInt("id"));
				evaluateEntity.setWho_id(resultSet.getInt("who_id"));
				
				list.add(evaluateEntity);
			}
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	public UserEntity getPersonal(String username) {
		// 获取个人信息
		Connection connection = DBUtil.getConnection();//创建连接
		String sql = "SELECT * from user WHERE username=?";//sql查询语句
		//创建数据库操作
		UserEntity userEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//传递参数
			preparedStatement.setString(1,username);
			//执行SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//取出返回值
			if(resultSet.next()) {
				userEntity = new UserEntity();
				userEntity.setAge(resultSet.getInt("age"));
				userEntity.setPhone(resultSet.getString("phone"));
				userEntity.setSex(resultSet.getInt("sex"));
				userEntity.setUsername(resultSet.getString("username"));
				userEntity.setType(resultSet.getInt("type"));
				userEntity.setAddress(resultSet.getString("address"));
				userEntity.setNet_name(resultSet.getString("net_name"));
			}
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return userEntity;
	}

}
