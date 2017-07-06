package com.test.Reader_writer_test;

import java.io.File;
import java.io.FileWriter;


public class Test2 {
	
	//使用字符流，完成文件的写入
	public static void main(String[] args) {
		
		String s1="hello world";
		String s2="hello world";
		String s3="hello world";
		File file=new File("e://b.txt");
		
		try {
			
			FileWriter  fw=new FileWriter(file);
		    fw.write(s1);
		    fw.write(s2);
		    fw.write(s3);
		    fw.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
