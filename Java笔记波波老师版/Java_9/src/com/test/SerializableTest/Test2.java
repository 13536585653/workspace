package com.test.SerializableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Test2 {
	
	//从文件中读取对象
	public static void main(String[] args) {
		
		File file=new File("e://dog.txt");
		
		try {
			FileInputStream  fis=new FileInputStream(file);
		    ObjectInputStream  ois=new ObjectInputStream(fis);
		    
		    Dog d=(Dog)ois.readObject();
		    
		    ois.close();
		    fis.close();
		    
		    
		    System.out.println(d);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
