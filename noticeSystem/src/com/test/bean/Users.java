package com.test.bean;
/*
 * 普通用户类
 * */
public class Users {
	//为普通用户类定义属性
	private int u_id;
	private String u_name;
	private String u_pwd;
	private String u_position;
	
	//为属性编写get、set方法
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
	public String getU_position() {
		return u_position;
	}
	public void setU_position(String u_position) {
		this.u_position = u_position;
	}
	
	//为user类编写构造方法
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int u_id, String u_name, String u_pwd, String u_position) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_position = u_position;
	}
	
	//为user类编写toString方法
	@Override
	public String toString() {
		return "Users [u_id=" + u_id + ", u_name=" + u_name + ", u_pwd=" + u_pwd + ", u_position=" + u_position + "]";
	}
	
}
