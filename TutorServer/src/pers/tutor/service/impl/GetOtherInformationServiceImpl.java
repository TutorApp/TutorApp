package pers.tutor.service.impl;

import java.util.List;

import pers.tutor.dao.GetOtherInformationDao;
import pers.tutor.dao.Impl.GetOtherInformationDaoImpl;
import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetOtherInformationService;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年5月2日 下午10:13:52
* 类说明
*/
public class GetOtherInformationServiceImpl implements GetOtherInformationService {

	@Override
	public List<EvaluateEntity> getEvaluation(int id) {
		//获取评价
		GetOtherInformationDao getOtherInformationDao = new GetOtherInformationDaoImpl();
		return getOtherInformationDao.getEvaluation(id);
	}

	@Override
	public UserEntity getPersonal(int id) {
		// 获取个人信息
		GetOtherInformationDao getOtherInformationDao = new GetOtherInformationDaoImpl();
		return getOtherInformationDao.getPersonal(id);
	}

}
