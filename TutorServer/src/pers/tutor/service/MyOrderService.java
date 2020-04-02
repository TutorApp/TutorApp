package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.MyOrderDao;
import pers.tutor.entity.OrderEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:09:46
* ��˵��	�鿴�����߼������ 
*/
public class MyOrderService {

	public List<OrderEntity> getMyOrder(int id) {
		MyOrderDao myOrderDao = new MyOrderDao();
		return myOrderDao.getMyOrder(id);
	}

	public int getUserId(String username) {
		MyOrderDao myOrderDao = new MyOrderDao();
		return myOrderDao.getUserId(username);
	}

}
