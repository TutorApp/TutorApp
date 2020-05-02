package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.DemandListDao;
import pers.tutor.dao.Impl.DemandListDaoImpl;
import pers.tutor.entity.DemandEntity;
import pers.tutor.service.DemandListService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����9:52:05
* ��˵��
*/
public class DemandListServiceImpl implements DemandListService {

	@Override
	public List<DemandEntity> demandList()  {
		
		DemandListDao demandListDao = new DemandListDaoImpl();
		return demandListDao.demandList();
	}

}
