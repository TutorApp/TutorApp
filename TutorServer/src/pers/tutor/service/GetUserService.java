package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.GetUserDao;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午5:41:55
    * 类说明	管理员获取用户信息逻辑处理层
 */
public class GetUserService {

	public List<UserEntity> getUser(int type) {
		
		GetUserDao getUserDao = new GetUserDao();
		return getUserDao.getUser(type);
	}

}
