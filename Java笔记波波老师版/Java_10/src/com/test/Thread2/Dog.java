package com.test.Thread2;

public class Dog implements Runnable {

	  //�࣬ʵ�� Runnable �ӿڣ�����дrun����
	
	@Override
	public void run() {
		
		 //��Ҫ��������
		for(int i=0;i<50;i++){
			System.out.println("******"+Thread.currentThread().getName()+"****"+i+"��********");
		}
		
	}

}
