package com.test.stringTest;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s1="abc";
		String s2=new String("abc");
		char[] cc={'a','b','c'};
		String s3=new String(cc);
		
		char[] dd={'a','b','c','d','e'};
		String s4 =new String(dd,2,3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
