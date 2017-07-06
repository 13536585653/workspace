package com.test.bean;


public class Cat  extends Animal{

	private int age;
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public Cat(){
		super();
	}
	public Cat(String name, int age){
		super(name);
		this.age=age;
	}
	
	public String toString(){
		return "Cat[name="+super.getName()+",age="+this.age+"]";
	}
	
	public void sleep(){
		System.out.println("猫:"+super.getName()+"在睡觉...");
	}
	
	//重写父类的eat方法
	public void eat(){
		super.eat();
		System.out.println("猫:"+super.getName()+"在吃鱼...");
	}
	
	
	
}
