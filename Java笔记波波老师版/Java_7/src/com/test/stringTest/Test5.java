package com.test.stringTest;

public class Test5 {
	
	public static void main(String[] args) {
		
		String s1=new String("abc");
		String s2=new String("def");
		/*
		 * java���== ,�ж����������Ƿ���ͬһ������
		 * 
		 * �ж��ַ�����ֵ�Ƿ���ͬ������equals����
		 * 
		 */
		
		if(s1==s2){
			System.out.println("�����ַ�����ͬһ������");
		}else if(s1.equals(s2)){
			System.out.println("�����ַ���������ͬ");
		}else
			System.out.println("�����ַ������ݲ�ͬ");
		
	}

}
