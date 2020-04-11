package pers.tutor.service;

import pers.tutor.entity.UserEntity;
import pers.tutor.dao.AddInformationDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午10:22:40
    * 类说明	用户维护个人信息逻辑处理层
 */
public class AddInformationService {

	public int addInformation(UserEntity studentEntity) {
		AddInformationDao addInformationDao = new AddInformationDao();
		return addInformationDao.addInformation(studentEntity);
	}

}
