package com.test.example;

public class Test {
	
	public static void main(String[] args) {
		
		Person p1=new Person();   //产生一个人
		
		Gun  gun=new Gun();   //产生一把枪
		p1.use(gun);    //将子类对象作为实参传入
		
		//Person p2=new Person();
		
		Knife  knife=new Knife();
		p1.use(knife);
	}

}
