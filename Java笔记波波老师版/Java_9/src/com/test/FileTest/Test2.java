package com.test.FileTest;

import java.io.File;

public class Test2 {
	
	public static void main(String[] args) {
		
		String name="e://abc";
		File file=new File(name);
		
	
		if(file.isDirectory()){
			System.out.println(name+"���ļ���");
		}else
			System.out.println(name+"���ļ�");
		
	   if(file.exists()){
		   
		   file.delete();
		   System.out.println("�ļ����ļ�����ɾ��");
	   }	
		
		file.mkdir();   //�����ļ���
		System.out.println("�ļ��д����ɹ�");
		
	}

}
