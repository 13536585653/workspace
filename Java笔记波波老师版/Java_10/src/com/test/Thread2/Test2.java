package com.test.Thread2;

public class Test2 {
	
	public static void main(String[] args) {
 		
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				//��Ҫ��������
				for(int i=0;i<=10;i++){
					System.out.println("***"+Thread.currentThread().getName()+"**"+i+"��****");
				}
				
			}
		});
		
		Thread th2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("aaaaaa");
				
			}
		});
		
		
		
		th1.start();
		th2.start();
		
		//System.out.println(new Dog());
		
	}

}
