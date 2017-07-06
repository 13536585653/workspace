package com.test.RegexTest;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test2 {
	
	public static void main(String[] args) {
	  
		  //检查邮箱
		  /*
		   * 
		   * 
		   */
		//编写邮箱h规则的正则表达式
		String regex="^(\\w)+@(\\w)+(\\.)(\\w)+$";
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入邮箱号码:");
		String email=input.nextLine();
		
		 //检查
		if(Pattern.matches(regex, email)){
			System.out.println("你输入的符合规则");
		}else
			System.out.println("你输入的不符合规则");
	}

}
