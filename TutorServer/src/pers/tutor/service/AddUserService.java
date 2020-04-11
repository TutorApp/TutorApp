package pers.tutor.service;

import pers.tutor.dao.AddUserDao;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午11:56:27
    * 类说明	添加用户逻辑处理层
 */
public class AddUserService {

	public int addUser(UserEntity userEntity) {
		//教师登录业务逻辑处理
		AddUserDao addUserDao = new AddUserDao();
		return addUserDao.addUser(userEntity);
	}

}
