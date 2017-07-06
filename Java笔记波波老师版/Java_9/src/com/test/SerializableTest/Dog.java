package com.test.SerializableTest;

import java.io.Serializable;

public class Dog  implements Serializable{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	

}
