package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.OrderEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:09:46
* ��˵��	�鿴�����߼������ 
*/
public interface MyOrderService {

	public List<OrderEntity> getMyOrder(int id);

	public int getUserId(String username);

}
