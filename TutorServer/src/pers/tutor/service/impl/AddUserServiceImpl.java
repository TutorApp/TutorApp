package pers.tutor.service.impl;

import pers.tutor.dao.AddUserDao;
import pers.tutor.dao.Impl.AddUserDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.AddUserService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:02:16
* 类说明
*/
public class AddUserServiceImpl implements AddUserService {

	@Override
	public int addUser(UserEntity userEntity) {
		//教师登录业务逻辑处理
		AddUserDao addUserDao = new AddUserDaoImpl();
		return addUserDao.addUser(userEntity);
	}

}
