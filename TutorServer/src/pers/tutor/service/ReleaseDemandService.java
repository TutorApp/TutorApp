package pers.tutor.service;

import pers.tutor.entity.DemandEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:09:46
* 类说明 	教师用户发布教学信息逻辑处理层
*/
public interface ReleaseDemandService {

	public int release(DemandEntity demandEntity);

	public int getTeacherId(String username);

}
