package com.test.Thread3;

public class Test5 {

	   //�̵߳�join ����
	 public static void main(String[] args) {
		
		 System.out.println("���߳̿�ʼ......");
		 
		 Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++){
					System.out.println("���̵߳ĵ�"+i+"��");
				}
				
			}
		});
		 
		th.start();
		 
		try {
			
			th.join();  //��th�߳����
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("���߳̽���......");
	} 
	
	
}
