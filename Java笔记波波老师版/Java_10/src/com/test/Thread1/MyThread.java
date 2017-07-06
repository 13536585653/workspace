package com.test.Thread1;

public class MyThread  extends Thread{

	  //自己编写的线程类 ,必须继承Thread
	
	
	//必须重写父类的run方法
	@Override
	public void run() {
		
		//写你希望做的事情
		
		for (int i = 1; i <= 50; i++) {
		    System.out.println("*****"+super.getName()+"运行了"+i+"次********");
		}
		
		
	}

	

	

	  
}
