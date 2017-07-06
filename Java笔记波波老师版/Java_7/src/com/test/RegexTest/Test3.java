package com.test.RegexTest;

public class Test3 {

	
	public static void main(String[] args) {
		
		//请把全部的姓名找出来
		String s="张三,李四:王五;赵六        冯七";
		
		String[] names=s.split("(,|:|;|\\s+)");  //使用分割正则表达式 将字符串分割成数组
		
		for(int i=0;i<names.length;i++){    //循环输出数组
			System.out.println(names[i]);
		}
		
		
	}
}
