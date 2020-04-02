package pers.tutor.service;

import pers.tutor.dao.OrderDao;
import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;


/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��1�� ����10:16:06
    * ��˵�� 	ѧ���û��µ��߼������
 */
public class OrderService {

	public int getStudentId(String username) {
		OrderDao orderDao = new OrderDao();
		return orderDao.getStudentId(username);
	}

	public int order(OrderModel orderModel, DemandEntity demandEntity) {
		OrderDao orderDao = new OrderDao();
		return orderDao.order(orderModel,demandEntity);
	}

	public DemandEntity demandInfo(int id) {
		OrderDao orderDao = new OrderDao();
		return orderDao.demandInfo(id);
	}


}
