package pers.tutor.service;

import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月1日 下午10:16:06
    * 类说明 	学生用户下单逻辑处理层
 */
public interface OrderService {

	public int getStudentId(String username);

	public int order(OrderModel orderModel, DemandEntity demandEntity);

	public DemandEntity demandInfo(int id);


}
