package pers.tutor.service;

import pers.tutor.entity.UserEntity;
import pers.tutor.dao.AddInformationDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����10:22:40
    * ��˵��	�û�ά��������Ϣ�߼������
 */
public class AddInformationService {

	public int addInformation(UserEntity studentEntity) {
		AddInformationDao addInformationDao = new AddInformationDao();
		return addInformationDao.addInformation(studentEntity);
	}

}
