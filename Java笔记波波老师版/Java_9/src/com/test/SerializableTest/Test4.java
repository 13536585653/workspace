package com.test.SerializableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test4 {
	
	//���ļ��ж�ȡ����
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		File file=new File("e://dog.txt");
		
		try {
			FileInputStream  fis=new FileInputStream(file);
		    ObjectInputStream  ois=new ObjectInputStream(fis);
		    
		    List list=(List)ois.readObject();
		    
		    ois.close();
		    fis.close();
		    
		    
		    System.out.println(list);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
