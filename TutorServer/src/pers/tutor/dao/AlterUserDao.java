package pers.tutor.dao;

import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午3:18:03
    * 类说明	管理员修改用户数据操作层
 */
public interface AlterUserDao {

	public int alterUser(UserEntity userEntity);
}
