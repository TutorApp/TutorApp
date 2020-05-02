package pers.tutor.service.impl;

import pers.tutor.dao.DeleteUserDao;
import pers.tutor.dao.Impl.DeleteUserDaoImpl;
import pers.tutor.service.DeleteUserService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:11:35
* 类说明
*/
public class DeleteUserServiceImpl implements DeleteUserService {

	@Override
	public int deleteUser(int id) {
		//教师登录业务逻辑处理
		DeleteUserDao deleteUserDao = new DeleteUserDaoImpl();
		return deleteUserDao.deleteUser(id);
	}
}
