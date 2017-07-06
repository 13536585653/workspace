package com.test.TimerTest;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Test2 {
	
	//开启2个线程，等2个子线程都执行完后，统计子线程一共执行了多少秒
	public static void main(String[] args) {
		
		final A a=new A();
		
		 System.out.println("主线程开始，计时开始");
		//开启计时器
		Timer timer =new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				a.n++;
			}
		}, 0, 1000);
		
	
		Thread th1,th2;
	
		

    //开启两个线程 ，做事
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
					System.out.println(Thread.currentThread().getName()+"在跑第"+i+"次");
				}
				
				System.out.println(Thread.currentThread().getName()+"结束");
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
					System.out.println(Thread.currentThread().getName()+"在跑第"+i+"次");
				}
				
				System.out.println(Thread.currentThread().getName()+"结束");
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
	 
	 System.out.println("主线程结束.....关闭计时器");
	 timer.cancel();
	 
	 System.out.println("总共耗时:"+a.n);
		
	 
	 
	}

}
