package pers.tutor.service;

import java.util.List;

import pers.tutor.dao.GetUserDao;
import pers.tutor.entity.UserEntity;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����5:41:55
    * ��˵��	����Ա��ȡ�û���Ϣ�߼������
 */
public class GetUserService {

	public List<UserEntity> getUser(int type) {
		
		GetUserDao getUserDao = new GetUserDao();
		return getUserDao.getUser(type);
	}

}
