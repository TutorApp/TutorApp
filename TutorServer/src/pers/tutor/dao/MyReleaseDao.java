package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.DemandEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��7�� ����8:34:18
    * ��˵��	��ʦ�û��鿴�ѷ����Ľ�ѧ��Ϣ���ݷ��ʲ�
 */
public interface MyReleaseDao {

	public List<DemandEntity> getMyRelease(int id)
;
	public int getUserId(String username);
}
