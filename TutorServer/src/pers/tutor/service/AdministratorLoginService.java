package pers.tutor.service;

import pers.tutor.dao.AdministratorLoginDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午3:44:03
    * 类说明	管理员登录逻辑处理层
 */
public class AdministratorLoginService {

	public int administratorLogin(String username, String password) {
		//教师登录业务逻辑处理
		AdministratorLoginDao administratorLoginDao = new AdministratorLoginDao();
		return administratorLoginDao.administratorLogin(username,password);
	}

}
