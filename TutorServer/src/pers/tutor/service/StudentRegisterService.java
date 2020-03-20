package pers.tutor.service;

import pers.tutor.entity.StudentEntity;
import pers.tutor.dao.StudentRegisterDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����6:32:43
    * ��˵��
 */
public class StudentRegisterService {

	public int register(StudentEntity studentEntity) {
		StudentRegisterDao studentRegister_dao = new StudentRegisterDao();
		return studentRegister_dao.register(studentEntity);
	}

}
