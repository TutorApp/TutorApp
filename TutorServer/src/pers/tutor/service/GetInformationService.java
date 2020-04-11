package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.GetInformationDao;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午11:00:22
    * 类说明	获取个人信息逻辑处理层
 */
public class GetInformationService {

	public List<EvaluateEntity> getEvaluation(String username) {
		//获取评价
		GetInformationDao getInformationDao = new GetInformationDao();
		return getInformationDao.getEvaluation(username);
	}

	public UserEntity getPersonal(String username) {
		// 获取个人信息
		GetInformationDao getInformationDao = new GetInformationDao();
		return getInformationDao.getPersonal(username);
	}

}
