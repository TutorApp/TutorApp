package pers.tutor.service;

import pers.tutor.dao.OrderDao;
import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月1日 下午10:16:06
    * 类说明 	学生用户下单逻辑处理层
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
