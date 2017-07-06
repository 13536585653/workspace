package com.test.synchroniczedTest;

public class Test1 {

	
	public static void main(String[] args) {
		
		final A  a1=new A();
		a1.setS1("aaaaaaaaaaaaaaaaa");
		a1.setS2("bbbbbbbbbbbbbbbbb");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			     a1.out1();
			}
		}).start();
		
		
        new Thread(new Runnable() {
			@Override
			public void run() {
			       a1.out2();
			}
		}).start();
		
	}
}
