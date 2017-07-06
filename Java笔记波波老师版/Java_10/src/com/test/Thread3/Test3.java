package com.test.Thread3;

public class Test3 {
	
	//让子线程每隔1秒，输出一句话，一共10句
	
	public static void main(String[] args) {
		
		  Thread  th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=1;i<=10;i++){
					try {
						
						 Thread.sleep(1000);
						 System.out.println("我爱你....");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		});
		  
		 th.start();
		
	}

}
