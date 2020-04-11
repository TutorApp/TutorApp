package pers.tutor.service;

import pers.tutor.dao.DeleteUserDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月6日 下午9:18:35
    * 类说明	管理员删除用户逻辑处理层
 */
public class DeleteUserService {

	public int deleteUser(int id) {
		//教师登录业务逻辑处理
		DeleteUserDao deleteUserDao = new DeleteUserDao();
		return deleteUserDao.deleteUser(id);
	}

}
