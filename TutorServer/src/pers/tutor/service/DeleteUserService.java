package pers.tutor.service;

import pers.tutor.dao.DeleteUserDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��6�� ����9:18:35
    * ��˵��	����Աɾ���û��߼������
 */
public class DeleteUserService {

	public int deleteUser(int id) {
		//��ʦ��¼ҵ���߼�����
		DeleteUserDao deleteUserDao = new DeleteUserDao();
		return deleteUserDao.deleteUser(id);
	}

}
