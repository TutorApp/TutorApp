package pers.tutor.dao;

import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明	学生用户下单数据访问层
*/
public interface OrderDao {

	public int getStudentId(String username);

	public int order(OrderModel orderModel,DemandEntity demandEntity);

	public DemandEntity demandInfo(int id);

	public void autoRefuse(int id,int demand_id);

}
