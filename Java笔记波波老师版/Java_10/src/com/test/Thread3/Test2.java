package com.test.Thread3;

public class Test2 {
	
	 //�̵߳�˯�� ���ж� 
	public static void main(String[] args)  throws Exception {
		
		System.out.println("���߳̿�ʼ.......");
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run(){
				
				System.out.println("*****"+Thread.currentThread().getName()+"��ʼ��....");
				try {
					Thread.sleep(5000);   //���߳�˯5��
					System.out.println("*****"+Thread.currentThread().getName()+"������....");
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
			}
		});
		
		th.start();
		
		
		Thread.sleep(2000);   //���߳�˯2��
		th.interrupt();   //�ж����߳�
		
		
		
		System.out.println("���߳̽���........");
	}

}
