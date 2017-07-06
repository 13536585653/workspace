package com.test.Thread3;

public class Test2 {
	
	 //线程的睡眠 与中断 
	public static void main(String[] args)  throws Exception {
		
		System.out.println("主线程开始.......");
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run(){
				
				System.out.println("*****"+Thread.currentThread().getName()+"开始了....");
				try {
					Thread.sleep(5000);   //本线程睡5秒
					System.out.println("*****"+Thread.currentThread().getName()+"结束了....");
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
			}
		});
		
		th.start();
		
		
		Thread.sleep(2000);   //本线程睡2秒
		th.interrupt();   //中断子线程
		
		
		
		System.out.println("主线程结束........");
	}

}
