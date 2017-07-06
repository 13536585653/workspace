package com.test.SerializableTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
	
	
	//将一个对象列表写入文件
	public static void main(String[] args) {
		
		Dog dog1=new Dog("小白",2);
		Dog dog2=new Dog("小黑",2);
		Dog dog3=new Dog("小红",2);
		
		List<Dog> list=new ArrayList<Dog>();
		
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		
				
       File file=new File("e://dog.txt");
       try {
		
    	   //创建字节输出流
    	   FileOutputStream  fos=new FileOutputStream(file);
    	   
    	   //通过字节输出流创建对象输出流
    	   ObjectOutputStream oos=new ObjectOutputStream(fos);
       
    	   //将list写入文件
    	   oos.writeObject(list);
    	   
    	   oos.close();  //关闭流
    	   fos.close();
       
       } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
		
		
	}

}
