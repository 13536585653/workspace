package com.test.stringTest;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
	    String s="  asdasdasds asdasd asdas das d  ";
	    //int x=s.length();
	    System.out.println("�ַ����ĳ�����:"+s.length());
		String newS=s.trim();  //ȥ���ַ���ǰ��Ŀո�
		System.out.println(newS+"���ַ����ĳ���Ϊ:"+newS.length());
	    
	    
	    String s1="abc";
	    char c=s1.charAt(1);
	    System.out.println("c:"+c);
	    
	    //indexOf  ����
	    Scanner input=new Scanner(System.in);
	    System.out.println("�������ַ���1:");
	    String s2=input.nextLine();
	    System.out.println("�������ַ���2:");
	    String s3=input.nextLine();
	    
	    if(s2.indexOf(s3)==-1){
	    	System.out.println("�ַ���1�в������ַ���2");
	    }else{
	    	System.out.println("�ַ���1�а����ַ���2");
	    	System.out.println("λ����:"+s2.indexOf(s3));
	    }
	    
	}

}
