package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月8日 下午1:44:14
    * 类说明	获取他人个人信息逻辑处理层
 */
public interface GetOtherInformationService {

	public List<EvaluateEntity> getEvaluation(int id);

	public UserEntity getPersonal(int id);

}
