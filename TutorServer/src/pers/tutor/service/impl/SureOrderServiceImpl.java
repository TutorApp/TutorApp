package pers.tutor.service.impl;

import pers.tutor.dao.SureOrderDao;
import pers.tutor.dao.Impl.SureOrderDaoImpl;
import pers.tutor.service.SureOrderService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:57:46
* 类说明
*/
public class SureOrderServiceImpl implements SureOrderService {

	@Override
	public int sureOrder(int id) {
		SureOrderDao sureOrderDao = new SureOrderDaoImpl();
		return sureOrderDao.sureOrder(id);
	}


}
