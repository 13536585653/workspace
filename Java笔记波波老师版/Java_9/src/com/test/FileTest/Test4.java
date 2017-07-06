package com.test.FileTest;

import java.io.File;

public class Test4 {
	
	public static void main(String[] args) {
		
		//通过递归输出文件夹里的全部内容
		String fileName="e://java";
		File file=new File(fileName);
		
		out(file);  
		
		
	}
	
	//递归调用，输出文件夹里的全部内容,含子文件夹 
	public static void out(File file){
		
		if(file!=null){
			if(file.isDirectory()){
				  //得到文件夹里的全部文件
				 File[] files=file.listFiles();
				 if(files!=null){
				    for (File f : files) {
					out(f);   //递归调用
				    }
				 }
			}else{
				System.out.println(file);
			}
		}
	}
}


