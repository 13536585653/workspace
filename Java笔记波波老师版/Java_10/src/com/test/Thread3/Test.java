package com.test.Thread3;

public class Test {
	
	 //�̵߳�˯��
	public static void main(String[] args)  throws Exception {
		
		System.out.println("���߳̿�ʼ.......");
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run(){
				
				System.out.println("*****"+Thread.currentThread().getName()+"��ʼ��....");
				try {
					Thread.sleep(2000);   //���߳�˯2��
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				System.out.println("*****"+Thread.currentThread().getName()+"������....");
			}
		});
		
		th.start();
		
		
		Thread.sleep(3000);   //���߳�˯3��
		
		
		
		
		System.out.println("���߳̽���........");
	}

}
