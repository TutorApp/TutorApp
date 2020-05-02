package pers.tutor.service.impl;

import pers.tutor.dao.ReleaseDemandDao;
import pers.tutor.dao.Impl.ReleaseDemandDaoImpl;
import pers.tutor.entity.DemandEntity;
import pers.tutor.service.ReleaseDemandService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:46:43
* 类说明
*/
public class ReleaseDemandServiceImpl implements ReleaseDemandService {

	@Override
	public int release(DemandEntity demandEntity) {
		ReleaseDemandDao releaseDemandDao = new ReleaseDemandDaoImpl();
		return releaseDemandDao.release(demandEntity);
	}

	@Override
	public int getTeacherId(String username) {
		ReleaseDemandDao releaseDemandDao = new ReleaseDemandDaoImpl();
		return releaseDemandDao.getTeacherId(username);
	}

}
