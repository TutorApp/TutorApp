package pers.tutor.service.impl;

import pers.tutor.dao.SureOrderDao;
import pers.tutor.dao.Impl.SureOrderDaoImpl;
import pers.tutor.service.SureOrderService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:57:46
* ��˵��
*/
public class SureOrderServiceImpl implements SureOrderService {

	@Override
	public int sureOrder(int id) {
		SureOrderDao sureOrderDao = new SureOrderDaoImpl();
		return sureOrderDao.sureOrder(id);
	}


}
