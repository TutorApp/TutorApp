package pers.tutor.service.impl;

import pers.tutor.dao.LoginDao;
import pers.tutor.dao.Impl.LoginDaoImpl;
import pers.tutor.service.LoginService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����9:06:07
* ��˵��
*/
public class LoginServiceImpl implements LoginService {

	@Override
	public int login(String username, String password) {
		//��ʦ��¼ҵ���߼�����
		LoginDao LoginDao = new LoginDaoImpl();
		return LoginDao.login(username,password);
	}

}
