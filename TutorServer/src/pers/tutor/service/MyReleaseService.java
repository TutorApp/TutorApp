package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.MyReleaseDao;
import pers.tutor.entity.DemandEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午8:46:34
    * 类说明	教师用户查看已发布的教学信息逻辑处理层
 */
public class MyReleaseService {

	public List<DemandEntity> getMyRelease(int id) {
		MyReleaseDao myReleaseDao = new MyReleaseDao();
		return myReleaseDao.getMyRelease(id);
	}

	public int getUserId(String username) {
		MyReleaseDao myReleaseDao = new MyReleaseDao();
		return myReleaseDao.getUserId(username);
	}

}
