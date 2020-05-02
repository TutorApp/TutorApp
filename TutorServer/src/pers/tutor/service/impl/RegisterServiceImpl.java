package pers.tutor.service.impl;

import pers.tutor.entity.UserEntity;
import pers.tutor.service.RegisterService;
import pers.tutor.dao.RegisterDao;
import pers.tutor.dao.Impl.RegisterDaoImpl;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:42:15
* ��˵��
*/
public class RegisterServiceImpl implements RegisterService {

	@Override
	public int register(UserEntity studentEntity) {
		RegisterDao studentRegister_dao = new RegisterDaoImpl();
		return studentRegister_dao.register(studentEntity);
	}

}
