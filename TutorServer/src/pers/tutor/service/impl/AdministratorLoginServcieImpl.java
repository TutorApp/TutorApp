package pers.tutor.service.impl;

import pers.tutor.dao.AdministratorLoginDao;
import pers.tutor.dao.Impl.AdministratorLoginDaoImpl;
import pers.tutor.service.AdministratorLoginService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午11:05:07
* 类说明
*/
public class AdministratorLoginServcieImpl implements AdministratorLoginService {

	@Override
	public int administratorLogin(String username, String password) {
		//教师登录业务逻辑处理
		AdministratorLoginDao administratorLoginDao = new AdministratorLoginDaoImpl();
		return administratorLoginDao.administratorLogin(username,password);
	}

}
