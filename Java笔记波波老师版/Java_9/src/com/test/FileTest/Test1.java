package com.test.FileTest;

import java.io.File;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//String fileName="e:\\a.txt";   //�����ļ���
		
		File file =new File("e:\\a.txt");   //ͨ���ļ���������һ���ļ�����
		
		
		if(file.exists()){
			
			System.out.println("���ļ��Ѵ���");
			file.delete();   //ɾ���ļ�
		    System.out.println("�ļ���ɾ��");
		}
		
		
		
		try {
				
				file.createNewFile();    //�������ļ�
			    System.out.println("�ļ�������");
			} catch (IOException e) {
				
				e.printStackTrace();
		 }   
		
	}

}
