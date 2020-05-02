package pers.tutor.dao;

import pers.tutor.entity.UserEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月20日 下午2:26:58
* 类说明	用户登录系统数据访问层
*/
public interface AddUserDao {

	public int addUser(UserEntity userEntity);
}
