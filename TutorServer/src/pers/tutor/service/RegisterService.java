package pers.tutor.service;

import pers.tutor.entity.UserEntity;
import pers.tutor.dao.RegisterDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午6:32:43
    * 类说明
 */
public class RegisterService {

	public int register(UserEntity studentEntity) {
		RegisterDao studentRegister_dao = new RegisterDao();
		return studentRegister_dao.register(studentEntity);
	}

}
