package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.GetInformationDao;
import pers.tutor.dao.Impl.GetInformationDaoImpl;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetInformationService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:08:18
* 类说明
*/
public class GetInformationServiceImpl implements GetInformationService {

	@Override
	public List<EvaluateEntity> getMyEvaluation(String username) {
		//获取他人对自己的评价
		GetInformationDao getMyInformationDao = new GetInformationDaoImpl();
		return getMyInformationDao.getMyEvaluation(username);
	}

	@Override
	public List<EvaluateEntity> getOtherEvaluation(String username) {
		//获取自己对他人的评价
		GetInformationDao getOtherInformationDao = new GetInformationDaoImpl();
		return getOtherInformationDao.getOtherEvaluation(username);
	}

	@Override
	public UserEntity getPersonal(String username) {
		// 获取个人信息
		GetInformationDao getInformationDao = new GetInformationDaoImpl();
		return getInformationDao.getPersonal(username);
	}

}
