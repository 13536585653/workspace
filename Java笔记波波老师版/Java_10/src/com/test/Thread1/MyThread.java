package com.test.Thread1;

public class MyThread  extends Thread{

	  //�Լ���д���߳��� ,����̳�Thread
	
	
	//������д�����run����
	@Override
	public void run() {
		
		//д��ϣ����������
		
		for (int i = 1; i <= 50; i++) {
		    System.out.println("*****"+super.getName()+"������"+i+"��********");
		}
		
		
	}

	

	

	  
}
