package pers.tutor.service;

import pers.tutor.dao.AddUserDao;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����11:56:27
    * ��˵��	����û��߼������
 */
public class AddUserService {

	public int addUser(UserEntity userEntity) {
		//��ʦ��¼ҵ���߼�����
		AddUserDao addUserDao = new AddUserDao();
		return addUserDao.addUser(userEntity);
	}

}
