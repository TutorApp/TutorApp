package pers.tutor.service;

import pers.tutor.dao.CancelOrderDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��2�� ����8:21:55
    * ��˵�� 	ѧ���û�ȡ�������߼������
 */
public class CancelOrderService {

	public int cancelOrder(int id) {
		CancelOrderDao cancelOrderDao = new CancelOrderDao();
		return cancelOrderDao.cancelOrder(id);
	}

}
