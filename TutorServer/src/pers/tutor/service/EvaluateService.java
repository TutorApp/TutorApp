package pers.tutor.service;

import pers.tutor.dao.EvaluateDao;
import pers.tutor.entity.EvaluateEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��3�� ����4:29:20
    * ��˵��	�����߼������
 */
public class EvaluateService {

	public int evaluate(EvaluateEntity evaluateEntity) {
		EvaluateDao evaluateDao = new EvaluateDao();
		return evaluateDao.evaluate(evaluateEntity);
	}

}
