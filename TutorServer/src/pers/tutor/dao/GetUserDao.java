package pers.tutor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.tutor.entity.UserEntity;
import pers.tutor.util.DBUtil;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����5:44:01
    * ��˵��	����Ա��ȡ�û���Ϣ���ݷ��ʲ�
 */
public class GetUserDao {

	public List<UserEntity> getUser(int type) {
		//1����������
		Connection conn = DBUtil.getConnection();
		//�������ݿ����
		String sql = "SELECT * FROM user WHERE type=?";
		UserEntity userEntity = null;
		List<UserEntity> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, type);
			//ִ��sql
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				userEntity = new UserEntity();
				userEntity.setId(resultSet.getInt("id"));
				userEntity.setUsername(resultSet.getString("username"));
				userEntity.setSex(resultSet.getInt("sex"));
				userEntity.setAge(resultSet.getInt("age"));
				userEntity.setPhone(resultSet.getString("phone"));
				userEntity.setAddress(resultSet.getString("address"));
				userEntity.setNet_name(resultSet.getString("net_name"));

				
				//��ȡ���ĵ�������װ��list��
				list.add(userEntity);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
