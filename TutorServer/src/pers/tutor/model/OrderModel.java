package pers.tutor.model;
/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年4月1日 下午9:51:53
* 类说明	下单模型
*/
public class OrderModel {
	private int id;
	private String student_phone;
	private String student_address;
	private int student_id;
	private String student_name;
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String string) {
		this.student_phone = string;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

}
