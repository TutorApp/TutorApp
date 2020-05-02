package pers.tutor.service.impl;

import pers.tutor.entity.UserEntity;
import pers.tutor.service.RegisterService;
import pers.tutor.dao.RegisterDao;
import pers.tutor.dao.Impl.RegisterDaoImpl;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:42:15
* 类说明
*/
public class RegisterServiceImpl implements RegisterService {

	@Override
	public int register(UserEntity studentEntity) {
		RegisterDao studentRegister_dao = new RegisterDaoImpl();
		return studentRegister_dao.register(studentEntity);
	}

}
