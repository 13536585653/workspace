package com.test.bean;

public class Student {

	/*
	 * 本类 对应 student表
	 * 
	 */
	
     private int s_id;
	 private String s_name;
	 private int s_age;
	 private String s_sex;
	 private String s_fun;
	 private City  city;
	 
	 public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_age() {
		return s_age;
	}
	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public String getS_fun() {
		return s_fun;
	}
	public void setS_fun(String s_fun) {
		this.s_fun = s_fun;
	}


	
	
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_age="
				+ s_age + ", s_sex=" + s_sex + ", s_fun=" + s_fun + ", city="
				+ city + "]";
	}
	
	public Student(int s_id, String s_name, int s_age, String s_sex,
			String s_fun ,City city) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
		this.s_sex = s_sex;
		this.s_fun = s_fun;
		this.city =city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
