package com.test.testStatic;

public class Test2 {
	
	public static void main(String[] args) {
		
		f();    //直接调用静态方法
	}
	
	public static void f(){   //f方法必须是静态的。
		System.out.println("f方法");
	}

}
