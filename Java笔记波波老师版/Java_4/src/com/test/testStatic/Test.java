package com.test.testStatic;

public class Test {
	
	public static void main(String[] args) {
		
		 int x=5;
		 int y=x;
		 y=10;
		 System.out.println("x:"+x);
		 System.out.println("y:"+y);
		 
		 A  a1=new A();
		 A  a2=new A();
		 a1.x=5;
		 a2.x=10;
		 System.out.println(a1);
		 System.out.println(a2); 
		 
		 a2=a1;   //a2和a1指向同一个对象
		 a2.x=15;
		 System.out.println("**************");
		 System.out.println(a1);
		 System.out.println(a2); 
	}

}
