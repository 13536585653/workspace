package com.test.TimerTest;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Test2 {
	
	//����2���̣߳���2�����̶߳�ִ�����ͳ�����߳�һ��ִ���˶�����
	public static void main(String[] args) {
		
		final A a=new A();
		
		 System.out.println("���߳̿�ʼ����ʱ��ʼ");
		//������ʱ��
		Timer timer =new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				a.n++;
			}
		}, 0, 1000);
		
	
		Thread th1,th2;
	
		

    //���������߳� ������
	 th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++){
					
					try {
						
						Thread.sleep(new Random().nextInt(1000)+500);
					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"���ܵ�"+i+"��");
				}
				
				System.out.println(Thread.currentThread().getName()+"����");
			}
		});
	 
	 th2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++){
					
					try {
						
						Thread.sleep(new Random().nextInt(1000)+500);
					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"���ܵ�"+i+"��");
				}
				
				System.out.println(Thread.currentThread().getName()+"����");
			}
		});
	 
	 th1.start();
	 th2.start();
	 
	 try {
		th1.join();
		th2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 System.out.println("���߳̽���.....�رռ�ʱ��");
	 timer.cancel();
	 
	 System.out.println("�ܹ���ʱ:"+a.n);
		
	 
	 
	}

}
