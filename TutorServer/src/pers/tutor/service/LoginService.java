package pers.tutor.service;

import pers.tutor.dao.LoginDao;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��20�� ����2:08:51
* ��ʦ��¼�߼������
*/
public class LoginService {

	public int login(String username, String password) {
		//��ʦ��¼ҵ���߼�����
		LoginDao LoginDao = new LoginDao();
		return LoginDao.login(username,password);
	}

}
