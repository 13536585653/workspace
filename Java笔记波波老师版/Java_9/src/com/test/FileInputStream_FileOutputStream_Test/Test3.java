package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test3 {
	
	   //将内容写入e:/a.txt
	
	public static void main(String[] args) {
		
		File file=new File("e://a.txt");
		
		
		try {
			//创建输出流
			FileOutputStream  fos=new FileOutputStream(file);
		    
			String s="hello world";
			
			//将字符串转为字节数组
		    byte[] b=s.getBytes();
		    
		    //把字节数组写入文件
            fos.write(b);
            
            fos.close();   //关闭流
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
