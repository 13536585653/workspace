package com.test.FileInputStream_FileOutputStream_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test4 {

	 //利用文件的读写， 一次性读完，再写，完成文件的复制
	public static void main(String[] args) {
		
		File file1=new File("e://abc/a.jpg");
		File file2=new File("e://abc/b.jpg");
//		
//		//如果b.jpg ,不存在，就创建它
//		if(!file2.exists()){
//			try {
//				
//				file2.createNewFile();  
//			
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
		//读a.jpg文件的内容
        try {
			
			//创建文件输入流
			FileInputStream  fis=new FileInputStream(file1);
			//BufferedInputStream bis=new BufferedInputStream(fis);
			
			
			//创建文件输出流
			FileOutputStream  fos=new FileOutputStream(file2);
		    //BufferedOutputStream  bos=new BufferedOutputStream(fos);
			//创建一个字节数组，大小应该为a.jpg文件的大小
			byte[] b=new byte[(int) file1.length()];
		    
			//一次性，读取a.jpg文件内容到字节数组b中
			fis.read(b);
			//把字节数组写入文件
            fos.write(b);
		
			//关闭读写
            fis.close();
            fos.close();
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
