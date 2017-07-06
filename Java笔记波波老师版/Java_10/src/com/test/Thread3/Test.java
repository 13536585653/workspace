package com.test.Thread3;

public class Test {
	
	 //线程的睡眠
	public static void main(String[] args)  throws Exception {
		
		System.out.println("主线程开始.......");
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run(){
				
				System.out.println("*****"+Thread.currentThread().getName()+"开始了....");
				try {
					Thread.sleep(2000);   //本线程睡2秒
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				System.out.println("*****"+Thread.currentThread().getName()+"结束了....");
			}
		});
		
		th.start();
		
		
		Thread.sleep(3000);   //本线程睡3秒
		
		
		
		
		System.out.println("主线程结束........");
	}

}
