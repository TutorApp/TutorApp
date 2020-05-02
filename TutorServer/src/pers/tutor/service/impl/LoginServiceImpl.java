package pers.tutor.service.impl;

import pers.tutor.dao.LoginDao;
import pers.tutor.dao.Impl.LoginDaoImpl;
import pers.tutor.service.LoginService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午9:06:07
* 类说明
*/
public class LoginServiceImpl implements LoginService {

	@Override
	public int login(String username, String password) {
		//教师登录业务逻辑处理
		LoginDao LoginDao = new LoginDaoImpl();
		return LoginDao.login(username,password);
	}

}
