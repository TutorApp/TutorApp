package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.MyReleaseDao;
import pers.tutor.dao.Impl.MyReleaseDaoImpl;
import pers.tutor.entity.DemandEntity;
import pers.tutor.service.MyReleaseService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:23:52
* ��˵��
*/
public class MyReleaseServiceImpl implements MyReleaseService {

	@Override
	public List<DemandEntity> getMyRelease(int id) {
		MyReleaseDao myReleaseDao = new MyReleaseDaoImpl();
		return myReleaseDao.getMyRelease(id);
	}

	@Override
	public int getUserId(String username) {
		MyReleaseDao myReleaseDao = new MyReleaseDaoImpl();
		return myReleaseDao.getUserId(username);
	}

}
