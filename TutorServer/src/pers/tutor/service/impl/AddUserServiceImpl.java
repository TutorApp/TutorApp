package pers.tutor.service.impl;

import pers.tutor.dao.AddUserDao;
import pers.tutor.dao.Impl.AddUserDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.AddUserService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����11:02:16
* ��˵��
*/
public class AddUserServiceImpl implements AddUserService {

	@Override
	public int addUser(UserEntity userEntity) {
		//��ʦ��¼ҵ���߼�����
		AddUserDao addUserDao = new AddUserDaoImpl();
		return addUserDao.addUser(userEntity);
	}

}
