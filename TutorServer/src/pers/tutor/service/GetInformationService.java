package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����11:00:22
    * ��˵��	��ȡ������Ϣ�߼������
 */
public interface GetInformationService {

	public List<EvaluateEntity> getMyEvaluation(String username);

	public List<EvaluateEntity> getOtherEvaluation(String username);
	
	public UserEntity getPersonal(String username);

}
