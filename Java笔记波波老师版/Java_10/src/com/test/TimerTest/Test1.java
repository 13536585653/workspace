package com.test.TimerTest;

import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
	
	//�趨5���ִ��ĳ���� ,ÿ��2���ظ�
	public static void main(String[] args) {
		
		Timer timer=new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("boom.......");
			}
		},5000,2000);
		
		
		//���߳�˯10�� �Ѽ�ʱ��ȡ����
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		timer.cancel();
		
	}

}
