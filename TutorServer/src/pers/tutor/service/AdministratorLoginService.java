package pers.tutor.service;

import pers.tutor.dao.AdministratorLoginDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����3:44:03
    * ��˵��	����Ա��¼�߼������
 */
public class AdministratorLoginService {

	public int administratorLogin(String username, String password) {
		//��ʦ��¼ҵ���߼�����
		AdministratorLoginDao administratorLoginDao = new AdministratorLoginDao();
		return administratorLoginDao.administratorLogin(username,password);
	}

}
