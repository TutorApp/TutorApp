package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.GetUserDao;
import pers.tutor.dao.Impl.GetUserDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetUserService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����11:14:44
* ��˵��
*/
public class GetUserServiceImpl implements GetUserService {

	@Override
	public List<UserEntity> getUser(int type) {
		
		GetUserDao getUserDao = new GetUserDaoImpl();
		return getUserDao.getUser(type);
	}

}
