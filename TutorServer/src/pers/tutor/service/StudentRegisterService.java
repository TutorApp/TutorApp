package pers.tutor.service;

import pers.tutor.entity.StudentEntity;
import pers.tutor.dao.StudentRegisterDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午6:32:43
    * 类说明
 */
public class StudentRegisterService {

	public int register(StudentEntity studentEntity) {
		StudentRegisterDao studentRegister_dao = new StudentRegisterDao();
		return studentRegister_dao.register(studentEntity);
	}

}
