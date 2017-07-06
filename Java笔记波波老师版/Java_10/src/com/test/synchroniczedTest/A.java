package com.test.synchroniczedTest;

public class A {

	private String s1;
	private String s2;
	
	public  void out1(){
		
		
		//同步代码块
		synchronized (this) {
			  
			//将字符串s1，按字母单个输出
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
	
	
	//同步方法
	public  synchronized void out2(){
		//将字符串s2，按字母单个输出
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
