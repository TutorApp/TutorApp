package pers.tutor.service.impl;

import pers.tutor.dao.RevodeDemandDao;
import pers.tutor.dao.Impl.RevodeDemandDaoImpl;
import pers.tutor.service.RevodeDemandService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:53:34
* ��˵��
*/
public class RevodeDemandServiceImpl implements RevodeDemandService {

	@Override
	public int revodeDemand(int id) {
		RevodeDemandDao revodeDemandDao = new RevodeDemandDaoImpl();
		return revodeDemandDao.revodeDemand(id);
	}

}
