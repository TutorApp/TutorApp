package pers.tutor.service.impl;

import pers.tutor.dao.DeleteUserDao;
import pers.tutor.dao.Impl.DeleteUserDaoImpl;
import pers.tutor.service.DeleteUserService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����11:11:35
* ��˵��
*/
public class DeleteUserServiceImpl implements DeleteUserService {

	@Override
	public int deleteUser(int id) {
		//��ʦ��¼ҵ���߼�����
		DeleteUserDao deleteUserDao = new DeleteUserDaoImpl();
		return deleteUserDao.deleteUser(id);
	}
}
