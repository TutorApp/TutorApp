package pers.tutor.entity;
/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月21日 下午5:10:11
* 类说明
*/
public class OrderEntity {
	private int id;
	private String subject;
	private String grade;
	private String name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}
