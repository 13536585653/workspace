package com.test.exceptionTest;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		  Scanner input =new Scanner(System.in);
		  int x=0;
		
		  
		  try{
			  
			  System.out.println("请输入x:");
			  x=input.nextInt();
			  
		  }finally{
			  
			  System.out.println("finally里的代码...");
		  }
		
		   System.out.println(x);
		   System.out.println("程序结束....");
		
	}

}
