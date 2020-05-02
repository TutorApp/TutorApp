package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.OrderEntity;

/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:30
* 类说明	用户查看订单数据访问层
*/
public interface MyOrderDao {

	public List<OrderEntity> getMyOrder(int id);

	public int getUserId(String username);

}
