package pers.tutor.dao;

import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午7:09:27
    * 类说明	用户注册数据访问层
 */
public interface RegisterDao {

	public int register(UserEntity userEntity);

}
