package pers.tutor.service;

import pers.tutor.dao.TeacherLoginDao;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月20日 下午2:08:51
* 教师登录服务层
*/
public class TeacherLoginService {

	public int login(String username, String password) {
		//教师登录业务逻辑处理
		TeacherLoginDao studentLogin_dao = new TeacherLoginDao();
		return studentLogin_dao.login(username,password);
	}

}
