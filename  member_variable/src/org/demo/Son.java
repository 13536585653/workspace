package org.demo;

public  class Son extends Father{
	//成员变量
	int  age;
	String name;
	//静态变量，比成员变量先加载
	static String address="珠海";
	//静态代码块
	static{
		System.out.println("初始化子类静态变量并执行了son的静态代码块、");
	}
	//普通方法
	public void see(){}
	//静态方法，不能调用普通方法，只能调用静态方法
	public static void eat(){
		System.out.println("son在吃东西");
		run();
		//see();不能调用普通方法
	}
	public static void run(){
		System.out.println("son在奔跑");
	}
	//成员代码块
	{
		System.out.println("son执行了成员代码块");
	}
	//构造方法
	public Son(){
		System.out.println("son执行了构造方法");
	}
	public static void main(String[] args) {
		Son s=new Son();
		//Son s1=new Son();
		s.address="赣州";
		Son.address="江西";
		s.address="九江";
		s.name="袁旺";
		s.age=3;
		System.out.println(Son.address);
		
		Son s1=new Son();
		s1.eat();
		//父类类型的子类对象（多态），因为是静态方法，所以不具备多态性，属性也一样。
		Father s2=new Son();
		s2.eat();
	}
}
