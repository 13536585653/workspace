package com.test.test;

import com.test.groupB.Dog;


public class Test1 {

	public static void main(String[] args) {
		
		
	    Dog  dog1=new Dog();   //调用空的构造方法
	    dog1.setName("小白");   //通过set方法为name赋值
	    dog1.setAge(10);
	    
	    
	    System.out.println(dog1.getName());  //通过get方法获得某属性的值
	    
	  
	    Dog   dog2  =new  Dog("小黑", 2);  //调用带参数的构造方法
	    Dog dog3=new Dog("小花", 1,"哈士奇");  //调用带参数的构造方法
	    
	    System.out.println(dog1);
	    System.out.println(dog2);
	    System.out.println(dog3);
	    
	}
	
}
