package com.test.FileTest;

import java.io.File;

public class Test2 {
	
	public static void main(String[] args) {
		
		String name="e://abc";
		File file=new File(name);
		
	
		if(file.isDirectory()){
			System.out.println(name+"是文件夹");
		}else
			System.out.println(name+"是文件");
		
	   if(file.exists()){
		   
		   file.delete();
		   System.out.println("文件或文件夹已删除");
	   }	
		
		file.mkdir();   //创建文件夹
		System.out.println("文件夹创建成功");
		
	}

}
