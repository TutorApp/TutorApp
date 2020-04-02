package pers.tutor.service;

import pers.tutor.dao.CancelOrderDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月2日 下午8:21:55
    * 类说明 	学生用户取消订单逻辑处理层
 */
public class CancelOrderService {

	public int cancelOrder(int id) {
		CancelOrderDao cancelOrderDao = new CancelOrderDao();
		return cancelOrderDao.cancelOrder(id);
	}

}
