package pers.tutor.service.impl;

import pers.tutor.dao.AdministratorLoginDao;
import pers.tutor.dao.Impl.AdministratorLoginDaoImpl;
import pers.tutor.service.AdministratorLoginService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����11:05:07
* ��˵��
*/
public class AdministratorLoginServcieImpl implements AdministratorLoginService {

	@Override
	public int administratorLogin(String username, String password) {
		//��ʦ��¼ҵ���߼�����
		AdministratorLoginDao administratorLoginDao = new AdministratorLoginDaoImpl();
		return administratorLoginDao.administratorLogin(username,password);
	}

}
