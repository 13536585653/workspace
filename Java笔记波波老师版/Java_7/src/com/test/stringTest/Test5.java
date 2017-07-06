package com.test.stringTest;

public class Test5 {
	
	public static void main(String[] args) {
		
		String s1=new String("abc");
		String s2=new String("def");
		/*
		 * java里的== ,判断两个对象是否是同一个对象
		 * 
		 * 判断字符串的值是否相同，请用equals方法
		 * 
		 */
		
		if(s1==s2){
			System.out.println("两个字符串是同一个对象");
		}else if(s1.equals(s2)){
			System.out.println("两个字符串内容相同");
		}else
			System.out.println("两个字符串内容不同");
		
	}

}
