package pers.tutor.service;

import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;


/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��1�� ����10:16:06
    * ��˵�� 	ѧ���û��µ��߼������
 */
public interface OrderService {

	public int getStudentId(String username);

	public int order(OrderModel orderModel, DemandEntity demandEntity);

	public DemandEntity demandInfo(int id);


}
