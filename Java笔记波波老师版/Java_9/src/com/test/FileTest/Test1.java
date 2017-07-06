package com.test.FileTest;

import java.io.File;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//String fileName="e:\\a.txt";   //定义文件名
		
		File file =new File("e:\\a.txt");   //通过文件名，创建一个文件对象
		
		
		if(file.exists()){
			
			System.out.println("该文件已存在");
			file.delete();   //删除文件
		    System.out.println("文件已删除");
		}
		
		
		
		try {
				
				file.createNewFile();    //生成新文件
			    System.out.println("文件已生成");
			} catch (IOException e) {
				
				e.printStackTrace();
		 }   
		
	}

}
