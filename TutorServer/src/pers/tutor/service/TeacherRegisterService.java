package pers.tutor.service;

import pers.tutor.entity.TeacherEntity;
import pers.tutor.dao.TeacherRegisterDao;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午6:32:43
    * 类说明
 */
public class TeacherRegisterService {

	public int register(TeacherEntity teacherEntity) {
		TeacherRegisterDao teacherRegister_dao = new TeacherRegisterDao();
		return teacherRegister_dao.register(teacherEntity);
	}

}
