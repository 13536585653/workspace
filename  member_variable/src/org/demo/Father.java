package org.demo;

public class Father {
	int age;
	String name;
	static String address;
	
	//静态代码块
	static{
		System.out.println("初始化成员变量并执行了father的静态代码块");
	}
	//成员代码块
	{
		System.out.println("执行了father的成员代码块");
	}
	//构造方法
	public  Father(){
		super();
		System.out.println("执行了father的构造方法");
	}
	//静态方法
	public static void eat(){
		System.out.println("father在吃东西");
	}
	public static void main(String[] args) {
		//通过方法名直接调用
		eat();
		//通过类名调用
		Father.eat();
		
	}
}
