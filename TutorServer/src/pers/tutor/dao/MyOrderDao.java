package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.OrderEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:10:30
* ��˵��	�û��鿴�������ݷ��ʲ�
*/
public interface MyOrderDao {

	public List<OrderEntity> getMyOrder(int id);

	public int getUserId(String username);

}
