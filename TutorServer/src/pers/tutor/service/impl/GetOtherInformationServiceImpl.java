package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.GetOtherInformationDao;
import pers.tutor.dao.Impl.GetOtherInformationDaoImpl;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetOtherInformationService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:13:52
* ��˵��
*/
public class GetOtherInformationServiceImpl implements GetOtherInformationService {

	@Override
	public List<EvaluateEntity> getEvaluation(int id) {
		//��ȡ����
		GetOtherInformationDao getOtherInformationDao = new GetOtherInformationDaoImpl();
		return getOtherInformationDao.getEvaluation(id);
	}

	@Override
	public UserEntity getPersonal(int id) {
		// ��ȡ������Ϣ
		GetOtherInformationDao getOtherInformationDao = new GetOtherInformationDaoImpl();
		return getOtherInformationDao.getPersonal(id);
	}

}
