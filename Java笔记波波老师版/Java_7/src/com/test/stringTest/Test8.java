package com.test.stringTest;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("����������:");
		
		 String s1=input.nextLine();
		
		 String s2=s1.replace("������","********");
		
		 System.out.println(s2);
	}

}
