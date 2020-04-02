package pers.tutor.service;

import pers.tutor.dao.LoginDao;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月20日 下午2:08:51
* 教师登录逻辑处理层
*/
public class LoginService {

	public int login(String username, String password) {
		//教师登录业务逻辑处理
		LoginDao LoginDao = new LoginDao();
		return LoginDao.login(username,password);
	}

}
