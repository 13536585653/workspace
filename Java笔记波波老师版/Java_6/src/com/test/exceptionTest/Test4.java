package com.test.exceptionTest;

public class Test4 {
	
	public static void main(String[] args) {
		
		try {
			f();   //调用时，必须捕获
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//这是一个申明为抛出异常的方法。
	public static void  f() throws Exception{
		
		throw new Exception("自己产生的异常....");
	
	}

}
