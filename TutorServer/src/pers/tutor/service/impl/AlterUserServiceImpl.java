package pers.tutor.service.impl;

import pers.tutor.dao.AlterUserDao;
import pers.tutor.dao.Impl.AlterUserDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.AlterUserService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����11:08:43
* ��˵��
*/
public class AlterUserServiceImpl implements AlterUserService {

	@Override
	public int alterUser(UserEntity studentEntity) {
		AlterUserDao alterUserDao = new AlterUserDaoImpl();
		return alterUserDao.alterUser(studentEntity);
	}

}
