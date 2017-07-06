package com.test.synchroniczedTest;

public class Test2 {
	
	//两个线程调用方法，交替执行
	
	public static void main(String[] args) {
		
	final AAAA a=new AAAA();
	
	
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			  for(int i=1;i<=5;i++)
				   a.a();
			   }
		}).start();
		
		
       new Thread(new Runnable() {
			
			@Override
			public void run() {
		    for(int i=1;i<=5;i++)
				   a.b();
			}
		}).start();
	
	 } 

}
