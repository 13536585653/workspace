package com.test.Reader_writer_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
	
	public static void main(String[] args) {
		
		//ʹ���ַ�������ȡ�ļ�����
		File file=new File("e://128��.txt");
		
		
		try {
			//�����ַ�������
			FileReader  fr=new FileReader(file);
			
			/*
			char[]  chars=new char[(int) file.length()];
			
			fr.read(chars);   //һ���Զ���
			
			//ѭ�����
			for (char c : chars) {
				System.out.print(c);
			}
			*/
			
			int c;
			while( (c=fr.read())!= -1){
				
				System.out.print((char)c);
			}
			
			fr.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
