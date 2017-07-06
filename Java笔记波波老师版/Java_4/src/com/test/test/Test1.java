package com.test.test;

import com.test.bean2.Boy;

public class Test1 {
	
	public static void main(String[] args) {
		
		Boy boy=new Boy();
		boy.setName("张三");
		boy.setSex("男");
		boy.setWeight(55.5);
		
		
		Boy boy1=new Boy("李四","男", 55.55);
		
		
		//boy1.eat();
		
		
		System.out.println(boy1);
		
	}

}
