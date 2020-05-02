package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.GetUserDao;
import pers.tutor.dao.Impl.GetUserDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetUserService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:14:44
* 类说明
*/
public class GetUserServiceImpl implements GetUserService {

	@Override
	public List<UserEntity> getUser(int type) {
		
		GetUserDao getUserDao = new GetUserDaoImpl();
		return getUserDao.getUser(type);
	}

}
