package pers.tutor.service.impl;

import pers.tutor.service.CancelOrderService;
import pers.tutor.dao.CancelOrderDao;
import pers.tutor.dao.Impl.CancelOrderDaoImpl;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����9:46:23
* ��˵��
*/
public class CancelOrderServiceImpl implements CancelOrderService {

	@Override
	public int cancelOrder(int id) {
		CancelOrderDao cancelOrderDao = new CancelOrderDaoImpl();
		return cancelOrderDao.cancelOrder(id);
	}

}
