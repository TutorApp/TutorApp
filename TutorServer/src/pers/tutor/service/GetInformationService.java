package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午11:00:22
    * 类说明	获取个人信息逻辑处理层
 */
public interface GetInformationService {

	public List<EvaluateEntity> getMyEvaluation(String username);

	public List<EvaluateEntity> getOtherEvaluation(String username);
	
	public UserEntity getPersonal(String username);

}
