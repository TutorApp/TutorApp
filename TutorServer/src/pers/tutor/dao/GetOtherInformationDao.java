package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��8�� ����1:45:18
    * ��˵��	��ȡ���˸�����Ϣ���ݷ��ʲ�
 */
public interface GetOtherInformationDao {

	public List<EvaluateEntity> getEvaluation(int id);

	public UserEntity getPersonal(int id);

}
