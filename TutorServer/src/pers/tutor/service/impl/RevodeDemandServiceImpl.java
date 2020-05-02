package pers.tutor.service.impl;

import pers.tutor.dao.RevodeDemandDao;
import pers.tutor.dao.Impl.RevodeDemandDaoImpl;
import pers.tutor.service.RevodeDemandService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:53:34
* 类说明
*/
public class RevodeDemandServiceImpl implements RevodeDemandService {

	@Override
	public int revodeDemand(int id) {
		RevodeDemandDao revodeDemandDao = new RevodeDemandDaoImpl();
		return revodeDemandDao.revodeDemand(id);
	}

}
