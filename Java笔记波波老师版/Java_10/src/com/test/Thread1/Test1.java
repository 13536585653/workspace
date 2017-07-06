package com.test.Thread1;

public class Test1 {
	
	
	//通过子类实现多线程
	public static void main(String[] args) {
		
		System.out.println("main线程开始......");
		
		//创建一个子线程对象。
		MyThread  myThread1 =new MyThread();
		MyThread  myThread2 =new MyThread();
		MyThread  myThread3 =new MyThread();
		
		YouThread  yThread=new YouThread();
		
		myThread1.start();      //创建子线程 ,会自动调用子类对象的run()
		myThread2.start();  
		myThread3.start();  
		
		yThread.start();
		
		
		System.out.println("main线程结束......");
	}

}
