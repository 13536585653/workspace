package org.demo.test;

public class ReflectBean {
	public int age;
	public Double num;
	private String reflectName;
	
	public ReflectBean(){
		System.out.println("�����޲� �Ĺ��췽����");
	}
	public ReflectBean(String name,int age){
		System.out.println("���Ǵ��εĹ��췽����");
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
