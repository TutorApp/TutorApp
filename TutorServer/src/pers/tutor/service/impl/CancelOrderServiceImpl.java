package pers.tutor.service.impl;

import pers.tutor.service.CancelOrderService;
import pers.tutor.dao.CancelOrderDao;
import pers.tutor.dao.Impl.CancelOrderDaoImpl;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午9:46:23
* 类说明
*/
public class CancelOrderServiceImpl implements CancelOrderService {

	@Override
	public int cancelOrder(int id) {
		CancelOrderDao cancelOrderDao = new CancelOrderDaoImpl();
		return cancelOrderDao.cancelOrder(id);
	}

}
