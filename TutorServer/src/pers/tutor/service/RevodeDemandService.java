package pers.tutor.service;

import pers.tutor.dao.RevodeDemandDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����7:35:35
    * ��˵��	��ʦ�û�������ѧ��Ϣ�߼������
 */
public class RevodeDemandService {

	public int revodeDemand(int id) {
		RevodeDemandDao revodeDemandDao = new RevodeDemandDao();
		return revodeDemandDao.revodeDemand(id);
	}

}
