package com.test.test;

import com.test.groupB.Dog;


public class Test1 {

	public static void main(String[] args) {
		
		
	    Dog  dog1=new Dog();   //���ÿյĹ��췽��
	    dog1.setName("С��");   //ͨ��set����Ϊname��ֵ
	    dog1.setAge(10);
	    
	    
	    System.out.println(dog1.getName());  //ͨ��get�������ĳ���Ե�ֵ
	    
	  
	    Dog   dog2  =new  Dog("С��", 2);  //���ô������Ĺ��췽��
	    Dog dog3=new Dog("С��", 1,"��ʿ��");  //���ô������Ĺ��췽��
	    
	    System.out.println(dog1);
	    System.out.println(dog2);
	    System.out.println(dog3);
	    
	}
	
}
