package pers.tutor.service;

import pers.tutor.dao.RevodeDemandDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午7:35:35
    * 类说明	教师用户撤销教学信息逻辑处理层
 */
public class RevodeDemandService {

	public int revodeDemand(int id) {
		RevodeDemandDao revodeDemandDao = new RevodeDemandDao();
		return revodeDemandDao.revodeDemand(id);
	}

}
