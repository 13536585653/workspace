package com.test.synchroniczedTest;

public class A {

	private String s1;
	private String s2;
	
	public  void out1(){
		
		
		//ͬ�������
		synchronized (this) {
			  
			//���ַ���s1������ĸ�������
			for(int i=0;i<s1.length();i++){
				try {
					Thread.sleep(1000);
					System.out.print(s1.charAt(i));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println();
		}
		
	}
	
	
	//ͬ������
	public  synchronized void out2(){
		//���ַ���s2������ĸ�������
		for(int i=0;i<s1.length();i++){
			try {
				Thread.sleep(1000);
				System.out.print(s2.charAt(i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public String getS1() {
		return s1;
	}


	public void setS1(String s) {
		this.s1 = s;
	}
	
	
	public String getS2() {
		return s2;
	}


	public void setS2(String s) {
		this.s2 = s;
	}
	
}
