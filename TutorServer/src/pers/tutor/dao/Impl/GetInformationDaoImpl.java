package pers.tutor.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.dao.GetInformationDao;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;


/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:05:44
* ��˵��
*/
public class GetInformationDaoImpl implements GetInformationDao {

	@Override
	public List<EvaluateEntity> getOtherEvaluation(String username) {
		//��ȡ���˶��Լ�������
		Connection connection = DBUtil.getConnection();//��������
		String sql = "SELECT evaluation.* FROM evaluation INNER JOIN user ON evaluation.who_id=`user`.id Where username = ?";//sql��ѯ���
		//�������ݿ����
		EvaluateEntity evaluateEntity = null;
		List<EvaluateEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//ȡ������ֵ
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
	
	@Override
	public List<EvaluateEntity> getMyEvaluation(String username) {
		//��ȡ�Լ������˵�����
		Connection connection = DBUtil.getConnection();//��������
		String sql = "SELECT evaluation.* FROM evaluation INNER JOIN user ON evaluation.user_id=`user`.id Where username = ?";//sql��ѯ���
		//�������ݿ����
		EvaluateEntity evaluateEntity = null;
		List<EvaluateEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//ȡ������ֵ
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
	
	@Override
	public UserEntity getPersonal(String username) {
		// ��ȡ������Ϣ
		Connection connection = DBUtil.getConnection();//��������
		String sql = "SELECT * from user WHERE username=?";//sql��ѯ���
		//�������ݿ����
		UserEntity userEntity = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ݲ���
			preparedStatement.setString(1,username);
			//ִ��SQL
			ResultSet resultSet = preparedStatement.executeQuery();
			//ȡ������ֵ
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
