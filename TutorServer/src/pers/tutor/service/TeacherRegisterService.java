package pers.tutor.service;

import pers.tutor.entity.TeacherEntity;
import pers.tutor.dao.TeacherRegisterDao;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����6:32:43
    * ��˵��
 */
public class TeacherRegisterService {

	public int register(TeacherEntity teacherEntity) {
		TeacherRegisterDao teacherRegister_dao = new TeacherRegisterDao();
		return teacherRegister_dao.register(teacherEntity);
	}

}
