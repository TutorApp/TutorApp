package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.OrderEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:09:46
* 类说明	查看订单逻辑处理层 
*/
public interface MyOrderService {

	public List<OrderEntity> getMyOrder(int id);

	public int getUserId(String username);

}
