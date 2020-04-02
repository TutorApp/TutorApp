package pers.tutor.entity;
/**
* @author 作者 E-mail:	ysen_top@163.com
* @version 创建时间		2020年3月20日 下午2:17:49
* 教师实体	用户实体
*/
public class UserEntity {
	
	private int id;
	private String username;
	private String password;
	private int type;
	
	
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
