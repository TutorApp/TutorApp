package pers.tutor.service;

import pers.tutor.dao.ReleaseDemandDao;
import pers.tutor.entity.DemandEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:09:46
* ��˵��
*/
public class ReleaseDemandService {

	public int release(DemandEntity demandEntity) {
		ReleaseDemandDao releaseDemandDao = new ReleaseDemandDao();
		return releaseDemandDao.release(demandEntity);
	}

	public int getTeacherId(String username) {
		ReleaseDemandDao releaseDemandDao = new ReleaseDemandDao();
		return releaseDemandDao.getTeacherId(username);
	}

}
