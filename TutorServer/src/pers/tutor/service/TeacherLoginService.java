package pers.tutor.service;

import pers.tutor.dao.TeacherLoginDao;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��20�� ����2:08:51
* ��ʦ��¼�����
*/
public class TeacherLoginService {

	public int login(String username, String password) {
		//��ʦ��¼ҵ���߼�����
		TeacherLoginDao studentLogin_dao = new TeacherLoginDao();
		return studentLogin_dao.login(username,password);
	}

}
