package pers.tutor.entity;
/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��3��20�� ����2:17:49
* ��ʦʵ��	�û�ʵ��
*/
public class UserEntity {
	
	private int id;
	private String username;
	private String password;
	private int type;
	private String phone;
	private int sex;
	private int age;
	private String net_name;
	private String address;
	
		
	public String getNet_name() {
		return net_name;
	}
	public void setNet_name(String net_name) {
		this.net_name = net_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	
}
