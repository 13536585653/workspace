package org.users.entity;

public class UserBean {
	private int u_id;
	private String u_name;
	private String u_password;
	private int u_age;
	private String u_address;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	@Override
	public String toString() {
		return "UserBean [u_id=" + u_id + ", u_name=" + u_name + ", u_age=" + u_age + ", u_address=" + u_address + "]";
	}
	
	
}
