package com.test.example3;

public class Car implements Alarm{

	public void run(){
		System.out.println("车的启动功能。。。。。");
	}

	@Override
	public void alarm() {
		System.out.println("车报警......滴滴滴");
		
	}
}
