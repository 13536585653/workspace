package com.test.bean;

/*
 * ����Ա��
 * */
public class Admins {
	
	//Ϊadmins����������
	private int a_id;
	private String a_name;
	private String a_pwd;
	private String a_position;
	
	
	//Ϊ���Ա�дget��set����
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_pwd() {
		return a_pwd;
	}
	public void setA_pwd(String a_pwd) {
		this.a_pwd = a_pwd;
	}
	public String getA_position() {
		return a_position;
	}
	public void setA_position(String a_position) {
		this.a_position = a_position;
	}
	
	
	//Ϊadmin���д���췽��
	public Admins() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admins(int a_id, String a_name, String a_pwd, String a_position) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_pwd = a_pwd;
		this.a_position = a_position;
	}
	
	//Ϊadmin���дtoString����

	@Override
	public String toString() {
		return "Admins [a_id=" + a_id + ", a_name=" + a_name + ", a_pwd=" + a_pwd + ", a_position=" + a_position + "]";
	}
	
	
}
