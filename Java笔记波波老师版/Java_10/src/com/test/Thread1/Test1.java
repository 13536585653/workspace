package com.test.Thread1;

public class Test1 {
	
	
	//ͨ������ʵ�ֶ��߳�
	public static void main(String[] args) {
		
		System.out.println("main�߳̿�ʼ......");
		
		//����һ�����̶߳���
		MyThread  myThread1 =new MyThread();
		MyThread  myThread2 =new MyThread();
		MyThread  myThread3 =new MyThread();
		
		YouThread  yThread=new YouThread();
		
		myThread1.start();      //�������߳� ,���Զ�������������run()
		myThread2.start();  
		myThread3.start();  
		
		yThread.start();
		
		
		System.out.println("main�߳̽���......");
	}

}
