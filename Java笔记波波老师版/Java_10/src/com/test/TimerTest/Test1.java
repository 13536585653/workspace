package com.test.TimerTest;

import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
	
	//设定5秒后，执行某件事 ,每隔2秒重复
	public static void main(String[] args) {
		
		Timer timer=new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("boom.......");
			}
		},5000,2000);
		
		
		//主线程睡10秒 把计时器取消掉
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		timer.cancel();
		
	}

}
