package pers.tutor.dao;

import java.util.List;

import pers.tutor.entity.DemandEntity;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午8:34:18
    * 类说明	教师用户查看已发布的教学信息数据访问层
 */
public interface MyReleaseDao {

	public List<DemandEntity> getMyRelease(int id)
;
	public int getUserId(String username);
}
