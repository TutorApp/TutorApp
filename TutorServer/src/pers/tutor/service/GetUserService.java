package pers.tutor.service;

import java.util.List;

import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����5:41:55
    * ��˵��	����Ա��ȡ�û���Ϣ�߼������
 */
public interface GetUserService {

	public List<UserEntity> getUser(int type);

}
