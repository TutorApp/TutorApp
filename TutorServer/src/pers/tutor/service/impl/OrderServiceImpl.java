package pers.tutor.service.impl;

import pers.tutor.dao.OrderDao;
import pers.tutor.dao.Impl.OrderDaoImpl;
import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;
import pers.tutor.service.OrderService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:32:34
* ��˵��
*/
public class OrderServiceImpl implements OrderService {

	@Override
	public int getStudentId(String username) {
		OrderDao orderDao = new OrderDaoImpl();
		return orderDao.getStudentId(username);
	}

	@Override
	public int order(OrderModel orderModel, DemandEntity demandEntity) {
		OrderDao orderDao = new OrderDaoImpl();
		return orderDao.order(orderModel,demandEntity);
	}

	@Override
	public DemandEntity demandInfo(int id) {
		OrderDao orderDao = new OrderDaoImpl();
		return orderDao.demandInfo(id);
	}

}
