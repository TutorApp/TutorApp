package pers.tutor.service;

import pers.tutor.dao.SureOrderDao;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月1日 下午10:16:06
    * 类说明 	教师用户确认订单逻辑处理层
 */
public class SureOrderService {

	public int sureOrder(int id) {
		SureOrderDao sureOrderDao = new SureOrderDao();
		return sureOrderDao.sureOrder(id);
	}

}
