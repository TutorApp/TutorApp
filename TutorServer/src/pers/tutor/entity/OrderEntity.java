package pers.tutor.entity;
/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:11
* 类说明	订单实体
*/
public class OrderEntity {
	private int id;
	private String subject;
	private String grade;
	private String teacher_name;
	private String student_name;
	private String teacher_phone;
	private String student_phone;
	private int teacher_id;
	private int student_id;
	private int state;
	private int salary;
	private String teacher_address;
	private String student_address;
	private String other;
	private String start_time;
	private String end_time;
	private String date;
	private int demand_id;
	
	
	
	public int getDemand_id() {
		return demand_id;
	}
	public void setDemand_id(int demand_id) {
		this.demand_id = demand_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getTeacher_phone() {
		return teacher_phone;
	}
	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTeacher_address() {
		return teacher_address;
	}
	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", subject=" + subject + ", grade=" + grade + ", teacher_name=" + teacher_name
				+ ", student_name=" + student_name + ", teacher_phone=" + teacher_phone + ", student_phone="
				+ student_phone + ", teacher_id=" + teacher_id + ", student_id=" + student_id + ", state=" + state
				+ ", salary=" + salary + ", teacher_address=" + teacher_address + ", student_address=" + student_address
				+ ", other=" + other + ", start_time=" + start_time + ", end_time=" + end_time + ", date=" + date
				+ ", demand_id=" + demand_id + "]";
	}
	
	
}
