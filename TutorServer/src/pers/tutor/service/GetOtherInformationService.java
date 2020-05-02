package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��8�� ����1:44:14
    * ��˵��	��ȡ���˸�����Ϣ�߼������
 */
public interface GetOtherInformationService {

	public List<EvaluateEntity> getEvaluation(int id);

	public UserEntity getPersonal(int id);

}
