package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.GetInformationDao;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����11:00:22
    * ��˵��	��ȡ������Ϣ�߼������
 */
public class GetInformationService {

	public List<EvaluateEntity> getEvaluation(String username) {
		//��ȡ����
		GetInformationDao getInformationDao = new GetInformationDao();
		return getInformationDao.getEvaluation(username);
	}

	public UserEntity getPersonal(String username) {
		// ��ȡ������Ϣ
		GetInformationDao getInformationDao = new GetInformationDao();
		return getInformationDao.getPersonal(username);
	}

}
