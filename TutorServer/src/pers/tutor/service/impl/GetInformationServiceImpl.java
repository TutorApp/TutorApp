package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.GetInformationDao;
import pers.tutor.dao.Impl.GetInformationDaoImpl;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetInformationService;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:08:18
* ��˵��
*/
public class GetInformationServiceImpl implements GetInformationService {

	@Override
	public List<EvaluateEntity> getMyEvaluation(String username) {
		//��ȡ���˶��Լ�������
		GetInformationDao getMyInformationDao = new GetInformationDaoImpl();
		return getMyInformationDao.getMyEvaluation(username);
	}

	@Override
	public List<EvaluateEntity> getOtherEvaluation(String username) {
		//��ȡ�Լ������˵�����
		GetInformationDao getOtherInformationDao = new GetInformationDaoImpl();
		return getOtherInformationDao.getOtherEvaluation(username);
	}

	@Override
	public UserEntity getPersonal(String username) {
		// ��ȡ������Ϣ
		GetInformationDao getInformationDao = new GetInformationDaoImpl();
		return getInformationDao.getPersonal(username);
	}

}
