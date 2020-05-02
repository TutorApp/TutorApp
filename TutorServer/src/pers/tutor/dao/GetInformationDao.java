package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午10:42:07
    * 类说明	查看个人信息数据访问层
 */
public interface GetInformationDao {

	public List<EvaluateEntity> getOtherEvaluation(String username);
	
	public List<EvaluateEntity> getMyEvaluation(String username);
	
	public UserEntity getPersonal(String username);

}
