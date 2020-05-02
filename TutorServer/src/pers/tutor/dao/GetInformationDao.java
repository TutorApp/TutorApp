package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����10:42:07
    * ��˵��	�鿴������Ϣ���ݷ��ʲ�
 */
public interface GetInformationDao {

	public List<EvaluateEntity> getOtherEvaluation(String username);
	
	public List<EvaluateEntity> getMyEvaluation(String username);
	
	public UserEntity getPersonal(String username);

}
