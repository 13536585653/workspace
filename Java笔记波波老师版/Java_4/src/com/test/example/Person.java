package com.test.example;

public class Person {
	
    //人有一个使用武器的方法,形参是个父类类型
	public void use(Weapon w){
		System.out.println("游戏开始...");
		w.attack();   //调用武器的攻击方法
		System.out.println("游戏结束");
	}
	
	
}
