package pers.tutor.service;

import pers.tutor.entity.DemandEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:09:46
* ��˵�� 	��ʦ�û�������ѧ��Ϣ�߼������
*/
public interface ReleaseDemandService {

	public int release(DemandEntity demandEntity);

	public int getTeacherId(String username);

}
