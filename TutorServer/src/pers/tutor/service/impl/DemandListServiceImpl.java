package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.DemandListDao;
import pers.tutor.dao.Impl.DemandListDaoImpl;
import pers.tutor.entity.DemandEntity;
import pers.tutor.service.DemandListService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午9:52:05
* 类说明
*/
public class DemandListServiceImpl implements DemandListService {

	@Override
	public List<DemandEntity> demandList()  {
		
		DemandListDao demandListDao = new DemandListDaoImpl();
		return demandListDao.demandList();
	}

}
