package org.demo.entity;

public class UserBean {
	private int u_id;
	private String u_name;
	private String u_pwd;
	private String u_sex;
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
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	@Override
	public String toString() {
		return "UserBean [u_id=" + u_id + ", u_name=" + u_name + ", u_pwd=" + u_pwd + ", u_sex=" + u_sex + "]";
	}
	
	
}
