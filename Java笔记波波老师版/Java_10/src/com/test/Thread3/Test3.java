package com.test.Thread3;

public class Test3 {
	
	//�����߳�ÿ��1�룬���һ�仰��һ��10��
	
	public static void main(String[] args) {
		
		  Thread  th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=1;i<=10;i++){
					try {
						
						 Thread.sleep(1000);
						 System.out.println("�Ұ���....");
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
