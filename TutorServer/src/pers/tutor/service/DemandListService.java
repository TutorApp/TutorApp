package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.DemandListDao;
import pers.tutor.entity.DemandEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:09:46
* ��˵��	ѧ���û���ȡ��ѧ��Ϣ�б��߼������
*/
public class DemandListService {

	public List<DemandEntity> demandList() {
		
		DemandListDao demandListDao = new DemandListDao();
		return demandListDao.demandList();
	}

}
