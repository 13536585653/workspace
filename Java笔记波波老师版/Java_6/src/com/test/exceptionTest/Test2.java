package com.test.exceptionTest;

public class Test2 {
	
	public static void main(String[] args) {
		
		int x=f();
		
		System.out.println(x);
		
	}
	
	public static int f(){
		
		String name=null;
		
		try{
		     name.toString();
		     return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 2;
		}
		finally{
			
			return 3;
		}
	}

}
