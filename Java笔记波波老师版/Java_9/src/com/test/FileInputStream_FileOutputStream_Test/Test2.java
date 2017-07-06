package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	
	 // 读取a.txt内容，一次读取多个字节
	
	public static void main(String[] args) {
		
		File  file=new File("e://a.txt");
		
		try {
			
			//创建文件输入流
			FileInputStream  fis=new FileInputStream(file);
		    //创建一个字节数组，大小应该为a.txt文件的大小
			byte[] b=new byte[(int) file.length()];
		
			//一次性，读取a.txt 文件内容到字节数组b中
			fis.read(b);
		
			//将字节数组，转成String 
			String s=new String(b);
			
			System.out.println(s);
			
			fis.close();   //关闭流
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
