package com.test.Thread3;

public class Test5 {

	   //线程的join 方法
	 public static void main(String[] args) {
		
		 System.out.println("主线程开始......");
		 
		 Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++){
					System.out.println("子线程的第"+i+"次");
				}
				
			}
		});
		 
		th.start();
		 
		try {
			
			th.join();  //等th线程完成
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("主线程结束......");
	} 
	
	
}
