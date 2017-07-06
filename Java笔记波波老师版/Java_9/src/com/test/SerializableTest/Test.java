package com.test.SerializableTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) {
		
		Dog dog=new Dog("小白",2);
				
       File file=new File("e://dog.txt");
       try {
		
    	   //创建字节输出流
    	   FileOutputStream  fos=new FileOutputStream(file);
    	   
    	   //通过字节输出流创建对象输出流
    	   ObjectOutputStream oos=new ObjectOutputStream(fos);
       
    	   //将对象写入文件
    	   oos.writeObject(dog);
    	   
    	   oos.close();  //关闭流
    	   fos.close();
       
       } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
		
		
	}

}
