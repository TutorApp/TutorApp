package pers.tutor.service.impl;

import pers.tutor.dao.EvaluateDao;
import pers.tutor.dao.Impl.EvaluateDaoImpl;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.service.EvaluateService;


/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:03:54
* 类说明
*/
public class EvaluateServiceImpl implements EvaluateService {

	@Override
	public int evaluate(EvaluateEntity evaluateEntity) {
		EvaluateDao evaluateDao = new EvaluateDaoImpl();
		return evaluateDao.evaluate(evaluateEntity);
	}

}
