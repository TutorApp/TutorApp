package pers.tutor.service.impl;

import pers.tutor.dao.EvaluateDao;
import pers.tutor.dao.Impl.EvaluateDaoImpl;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.service.EvaluateService;


/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��5��2�� ����10:03:54
* ��˵��
*/
public class EvaluateServiceImpl implements EvaluateService {

	@Override
	public int evaluate(EvaluateEntity evaluateEntity) {
		EvaluateDao evaluateDao = new EvaluateDaoImpl();
		return evaluateDao.evaluate(evaluateEntity);
	}

}
