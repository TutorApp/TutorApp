package pers.tutor.service.impl;

import pers.tutor.dao.AddInformationDao;
import pers.tutor.dao.Impl.AddInformationDaoImpl;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.AddInformationService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����9:15:40
* ��˵��
*/
public class AddInformationServiceImpl implements AddInformationService {

	@Override
	public int addInformation(UserEntity studentEntity) {
		AddInformationDao addInformationDao = new AddInformationDaoImpl();
		return addInformationDao.addInformation(studentEntity);
	}

}
