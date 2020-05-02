package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.DemandEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:09:46
* 类说明	学生用户获取教学信息列表逻辑处理层
*/
public interface DemandListService {

	public List<DemandEntity> demandList();

}
