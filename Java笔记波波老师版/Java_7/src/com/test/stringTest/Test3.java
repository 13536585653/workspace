package com.test.stringTest;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		 
		
	    //判断邮箱账号，是否合格？
		// abc@qq.aaa.com
		//必须有@,必须有. @在.前面， @不能是第一个，.不能是最后一个
		 Scanner input=new Scanner(System.in);
		 System.out.println("请输入邮箱账号:");
		 String email=input.nextLine();
		 
		 //找@
		 int index1=email.indexOf("@");
		 //找最后一个.
		 int index2=email.lastIndexOf(".");
		 
		 if(index1>0 && index2!=-1 && index2<(email.length()-1) 
				 && index1<index2){
			 System.out.println("账号格式符合!");
		 }else
			 System.out.println("账号格式不符合!");
	
	
	
	}

}
