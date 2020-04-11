package pers.tutor.service;

import pers.tutor.dao.EvaluateDao;
import pers.tutor.entity.EvaluateEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月3日 下午4:29:20
    * 类说明	评价逻辑处理层
 */
public class EvaluateService {

	public int evaluate(EvaluateEntity evaluateEntity) {
		EvaluateDao evaluateDao = new EvaluateDao();
		return evaluateDao.evaluate(evaluateEntity);
	}

}
