package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.MyReleaseDao;
import pers.tutor.entity.DemandEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��7�� ����8:46:34
    * ��˵��	��ʦ�û��鿴�ѷ����Ľ�ѧ��Ϣ�߼������
 */
public class MyReleaseService {

	public List<DemandEntity> getMyRelease(int id) {
		MyReleaseDao myReleaseDao = new MyReleaseDao();
		return myReleaseDao.getMyRelease(id);
	}

	public int getUserId(String username) {
		MyReleaseDao myReleaseDao = new MyReleaseDao();
		return myReleaseDao.getUserId(username);
	}

}
