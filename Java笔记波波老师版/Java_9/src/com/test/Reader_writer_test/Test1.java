package com.test.Reader_writer_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
	
	public static void main(String[] args) {
		
		//使用字符流，读取文件内容
		File file=new File("e://128班.txt");
		
		
		try {
			//创建字符输入流
			FileReader  fr=new FileReader(file);
			
			/*
			char[]  chars=new char[(int) file.length()];
			
			fr.read(chars);   //一次性读完
			
			//循环输出
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
