package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午5:44:01
    * 类说明	管理员获取用户信息数据访问层
 */
public interface GetUserDao {

	public List<UserEntity> getUser(int type);

}
