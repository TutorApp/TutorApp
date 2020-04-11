package pers.tutor.entity;
/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年4月3日 下午4:25:32
* 类说明	评价实体
*/
public class EvaluateEntity {
	
	private int id;
	private int user_id;
	private int who_id;
	private String evaluation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public int getWho_id() {
		return who_id;
	}
	public void setWho_id(int who_id) {
		this.who_id = who_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
}
