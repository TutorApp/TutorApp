package pers.tutor.service;

import pers.tutor.dao.StudentLoginDao;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��20�� ����2:08:51
* ��ʦ��¼�����
*/
public class StudentLoginService {

	public int login(String username, String password) {
		//��ʦ��¼ҵ���߼�����
		StudentLoginDao studentLogin_dao = new StudentLoginDao();
		return studentLogin_dao.login(username,password);
	}

}
