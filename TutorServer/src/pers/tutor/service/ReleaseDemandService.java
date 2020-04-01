package pers.tutor.service;

import pers.tutor.dao.ReleaseDemandDao;
import pers.tutor.entity.DemandEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:09:46
* 类说明
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
