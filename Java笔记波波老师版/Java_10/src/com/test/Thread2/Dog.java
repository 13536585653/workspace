package com.test.Thread2;

public class Dog implements Runnable {

	  //类，实现 Runnable 接口，并重写run方法
	
	@Override
	public void run() {
		
		 //做要做的事情
		for(int i=0;i<50;i++){
			System.out.println("******"+Thread.currentThread().getName()+"****"+i+"次********");
		}
		
	}

}
