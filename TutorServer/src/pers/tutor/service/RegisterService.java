package pers.tutor.service;

import pers.tutor.entity.UserEntity;
import pers.tutor.dao.RegisterDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����6:32:43
    * ��˵��
 */
public class RegisterService {

	public int register(UserEntity studentEntity) {
		RegisterDao studentRegister_dao = new RegisterDao();
		return studentRegister_dao.register(studentEntity);
	}

}
