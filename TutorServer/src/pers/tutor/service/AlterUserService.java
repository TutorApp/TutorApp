package pers.tutor.service;

import pers.tutor.entity.UserEntity;
import pers.tutor.dao.AlterUserDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��7�� ����3:27:46
    * ��˵��	����Ա�޸��û��߼������
 */
public class AlterUserService {

	public int alterUser(UserEntity studentEntity) {
		AlterUserDao alterUserDao = new AlterUserDao();
		return alterUserDao.alterUser(studentEntity);
	}

}
