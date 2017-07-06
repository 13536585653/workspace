package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

	  //读取e://a.txt文件内容 ，每次读取单字节
	 public static void main(String[] args) {
		
		File file=new File("e:\\a.txt");   //创建文件对象
		
		if(file.exists()){
			
			try {
				//创建fileInputStream对象
				FileInputStream fis=new FileInputStream(file);
			    int temp;
			    
			    //通过循环读取文件内容，输出
				while( (temp=fis.read()) != -1  ){
					char c=(char)temp;   //将读取的结果转成char型
					System.out.print(c);
				}
			
			     fis.close();   //关闭流
			
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}else{
			
			System.out.println("该文件不存在");
		}
		 
	}
	
}
