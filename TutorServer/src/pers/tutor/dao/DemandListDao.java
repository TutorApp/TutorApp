package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.DemandEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明 学生用户获取教学信息数据访问层
*/
public interface DemandListDao {

	public List<DemandEntity> demandList();

}
