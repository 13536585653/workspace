package com.test.example3;

public class Car implements Alarm{

	public void run(){
		System.out.println("�����������ܡ���������");
	}

	@Override
	public void alarm() {
		System.out.println("������......�εε�");
		
	}
}
