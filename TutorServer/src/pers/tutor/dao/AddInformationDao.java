package pers.tutor.dao;

import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午9:54:21
    * 类说明	个人信息维护数据访问层
 */
public interface AddInformationDao {

	public int addInformation(UserEntity userEntity);
}
