package org.demo.test;

public class ReflectBean {
	public int age;
	public Double num;
	private String reflectName;
	
	public ReflectBean(){
		System.out.println("我是无参 的构造方法！");
	}
	public ReflectBean(String name,int age){
		System.out.println("我是带参的构造方法！");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getReflectName() {
		return reflectName;
	}
	public void setReflectName(String reflectName) {
		this.reflectName = reflectName;
	}
	
	@SuppressWarnings("unused")
	private void say(String name){
		System.out.println("hello world!");
	}
}
