package pers.tutor.dao;

import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:10:30
* ��˵��	ѧ���û��µ����ݷ��ʲ�
*/
public interface OrderDao {

	public int getStudentId(String username);

	public int order(OrderModel orderModel,DemandEntity demandEntity);

	public DemandEntity demandInfo(int id);

	public void autoRefuse(int id,int demand_id);

}
