package org.demo;

public abstract class Teacher {
	//抽象类的抽象方法
	public abstract void Call();
	//抽象类的构造方法
	public Teacher(){}
	//抽象类的普通方法（具体方法）
	public void lesson(){
		System.out.println("点名。。。。。。");
	}
	
}
