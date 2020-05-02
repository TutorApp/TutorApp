package pers.tutor.service.impl;

import pers.tutor.dao.AddInformationDao;
import pers.tutor.dao.Impl.AddInformationDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.AddInformationService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午9:15:40
* 类说明
*/
public class AddInformationServiceImpl implements AddInformationService {

	@Override
	public int addInformation(UserEntity studentEntity) {
		AddInformationDao addInformationDao = new AddInformationDaoImpl();
		return addInformationDao.addInformation(studentEntity);
	}

}
