package com.test.FileTest;

import java.io.File;

public class Test3 {
	
	public static void main(String[] args) {
		
		//获取e:/java目录下，全部的文件名称
		String fileName="e://java";
		File file=new File(fileName);
		
		System.out.println(fileName+"文件夹里的全部文件为:");
		
		if(file.exists() && file.isDirectory() ){
			
			String[]  names=file.list();      //获得文件夹里的全部文件名称
			
			for (String name : names) {
				System.out.println(name);
			}
			
			System.out.println("*****************");
			
			File[] files=file.listFiles();  //获得文件夹里的全部文件
			
			for (File f : files) {
				System.out.println(f+"--"+f.length());
			}
			
		}
		
		
		
	}

}
