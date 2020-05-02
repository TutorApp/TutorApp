package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月8日 下午1:45:18
    * 类说明	获取他人个人信息数据访问层
 */
public interface GetOtherInformationDao {

	public List<EvaluateEntity> getEvaluation(int id);

	public UserEntity getPersonal(int id);

}
