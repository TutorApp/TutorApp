package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����5:44:01
    * ��˵��	����Ա��ȡ�û���Ϣ���ݷ��ʲ�
 */
public interface GetUserDao {

	public List<UserEntity> getUser(int type);

}
