package com.test.Thread3;

import java.io.IOException;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) throws Exception {

		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
			   
			
					try {
						while(true){
						  Thread.sleep(1000);
						  System.out.println("�Ұ���");
						}
					 } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
					}
						
			}
		});
		th.start();
		
		System.out.println("�������+�س��жϣ�");
		int i=System.in.read();
		th.interrupt();    //�ж�th���߳�
		
		
		
		
		   
			
		
		
		
	}

}
