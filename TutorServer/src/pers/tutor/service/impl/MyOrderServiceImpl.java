package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.MyOrderDao;
import pers.tutor.dao.Impl.MyOrderDaoImpl;
import pers.tutor.entity.OrderEntity;
import pers.tutor.service.MyOrderService;


/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:19:51
* ��˵��
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
