package com.test.exceptionTest;

public class MyException extends Exception{

	   //编写MyException类，继承Exception
	
	//无参构造方法
	public MyException(){
		super();
	}
	
	//有参构造方法
	public MyException(String message){
		super(message);
	}
}
