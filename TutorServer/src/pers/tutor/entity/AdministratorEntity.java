package pers.tutor.entity;
/**
* @author ���� E-mail:	ysen_top@163.com
* @version ����ʱ��		2020��4��5�� ����3:42:44
* ��˵��
*/
public class AdministratorEntity {
	private int id;
	private String username;
	private String password;
	private String name;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
