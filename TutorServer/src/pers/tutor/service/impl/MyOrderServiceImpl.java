package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.MyOrderDao;
import pers.tutor.dao.Impl.MyOrderDaoImpl;
import pers.tutor.entity.OrderEntity;
import pers.tutor.service.MyOrderService;


/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:19:51
* 类说明
*/
public class MyOrderServiceImpl implements MyOrderService {

	@Override
	public List<OrderEntity> getMyOrder(int id) {
		MyOrderDao myOrderDao = new MyOrderDaoImpl();
		return myOrderDao.getMyOrder(id);
	}

	@Override
	public int getUserId(String username) {
		MyOrderDao myOrderDao = new MyOrderDaoImpl();
		return myOrderDao.getUserId(username);
	}

}
