package com.test.test;

import com.test.bean2.Boy;

public class Test1 {
	
	public static void main(String[] args) {
		
		Boy boy=new Boy();
		boy.setName("����");
		boy.setSex("��");
		boy.setWeight(55.5);
		
		
		Boy boy1=new Boy("����","��", 55.55);
		
		
		//boy1.eat();
		
		
		System.out.println(boy1);
		
	}

}
