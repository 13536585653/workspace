package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test5 {
	
	//使用边读，边写，完成文件的复制
	public static void main(String[] args) {
		
		File file1=new File("e://abc//yy.exe");
		File file2=new File("e://abc//zz.exe");
		
		try {
			//创建输入流和输出流
			FileInputStream fis=new FileInputStream(file1);
			FileOutputStream fos=new FileOutputStream(file2);
		    
			int b;  
			  //边读
		     while( (b=fis.read())!= -1 ){
		    	 
		    	 fos.write(b);   //边写
		     }
		
		     fis.close();
		     fos.close();
		   
		     System.out.println("复制完毕");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
