package pers.tutor.service;

import pers.tutor.dao.SureOrderDao;


/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��1�� ����10:16:06
    * ��˵�� 	��ʦ�û�ȷ�϶����߼������
 */
public class SureOrderService {

	public int sureOrder(int id) {
		SureOrderDao sureOrderDao = new SureOrderDao();
		return sureOrderDao.sureOrder(id);
	}

}
