package pers.tutor.dao;

import pers.tutor.entity.DemandEntity;

/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��21�� ����5:10:30
* ��˵�� ��ʦ�û��������ݷ��ʲ�
*/
public interface ReleaseDemandDao {

	public int release(DemandEntity demandEntity);

	public int getTeacherId(String username);

}
