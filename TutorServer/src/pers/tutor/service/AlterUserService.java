package pers.tutor.service;

import pers.tutor.entity.UserEntity;
import pers.tutor.dao.AlterUserDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午3:27:46
    * 类说明	管理员修改用户逻辑处理层
 */
public class AlterUserService {

	public int alterUser(UserEntity studentEntity) {
		AlterUserDao alterUserDao = new AlterUserDao();
		return alterUserDao.alterUser(studentEntity);
	}

}
