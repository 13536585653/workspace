package com.test.Thread2;

public class Test {
	
	   //ͨ���ӿڣ�ʵϰ���߳�
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		Thread th=new Thread(dog);
		Thread th2=new Thread(dog);
		
		th.start();
		th2.start();
		
	}

}
