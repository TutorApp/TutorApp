package pers.tutor.dao;

import pers.tutor.entity.DemandEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明 教师用户发布数据访问层
*/
public interface ReleaseDemandDao {

	public int release(DemandEntity demandEntity);

	public int getTeacherId(String username);

}
