package com.test.RegexTest;

import java.util.regex.Pattern;

public class Test4 {
	
	public static void main(String[] args) {
	
		 /*
		  * 将一段文字中的全部邮箱找出来
		  * 
		  */
		String s="aasdasd dasdasd,wea@abc.com:;adasdasdadasd. ag@ccc.net";
		
		//将字符串分割成字符串数组
		String[] ss=s.split("(,|:|;|\\s+)");
		
		//邮箱正则规则
		String regex="^(\\w)+@(\\w)+(\\.)(\\w)+$";
		//循环数组,将匹配邮箱规则的字符串输出
		for(int i=0;i<ss.length;i++ ){
			
			if(Pattern.matches(regex, ss[i])){
				System.out.println(ss[i]);
			}
		}
		
		
	}

}
