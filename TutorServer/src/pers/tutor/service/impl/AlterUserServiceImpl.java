package pers.tutor.service.impl;

import pers.tutor.dao.AlterUserDao;
import pers.tutor.dao.Impl.AlterUserDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.AlterUserService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:08:43
* 类说明
*/
public class AlterUserServiceImpl implements AlterUserService {

	@Override
	public int alterUser(UserEntity studentEntity) {
		AlterUserDao alterUserDao = new AlterUserDaoImpl();
		return alterUserDao.alterUser(studentEntity);
	}

}
