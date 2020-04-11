package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.GetOtherInformationDao;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��8�� ����1:44:14
    * ��˵��	��ȡ���˸�����Ϣ�߼������
 */
public class GetOtherInformationService {

	public List<EvaluateEntity> getEvaluation(int id) {
		//��ȡ����
		GetOtherInformationDao getOtherInformationDao = new GetOtherInformationDao();
		return getOtherInformationDao.getEvaluation(id);
	}

	public UserEntity getPersonal(int id) {
		// ��ȡ������Ϣ
		GetOtherInformationDao getOtherInformationDao = new GetOtherInformationDao();
		return getOtherInformationDao.getPersonal(id);
	}

}
