package com.test.FileTest;

import java.io.File;

public class Test3 {
	
	public static void main(String[] args) {
		
		//��ȡe:/javaĿ¼�£�ȫ�����ļ�����
		String fileName="e://java";
		File file=new File(fileName);
		
		System.out.println(fileName+"�ļ������ȫ���ļ�Ϊ:");
		
		if(file.exists() && file.isDirectory() ){
			
			String[]  names=file.list();      //����ļ������ȫ���ļ�����
			
			for (String name : names) {
				System.out.println(name);
			}
			
			System.out.println("*****************");
			
			File[] files=file.listFiles();  //����ļ������ȫ���ļ�
			
			for (File f : files) {
				System.out.println(f+"--"+f.length());
			}
			
		}
		
		
		
	}

}
