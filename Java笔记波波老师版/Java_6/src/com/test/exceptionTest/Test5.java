package com.test.exceptionTest;

public class Test5 {

	public static void main(String[] args) {
		
		try {
			
			f();
		
		} catch (MyException e) {

             e.printStackTrace();
		}
		
	}
	
	public static void f() throws MyException{
		
		throw new MyException("我自己定义的异常....");
		
	}
}
