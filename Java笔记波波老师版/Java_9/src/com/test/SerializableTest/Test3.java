package com.test.SerializableTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
	
	
	//��һ�������б�д���ļ�
	public static void main(String[] args) {
		
		Dog dog1=new Dog("С��",2);
		Dog dog2=new Dog("С��",2);
		Dog dog3=new Dog("С��",2);
		
		List<Dog> list=new ArrayList<Dog>();
		
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		
				
       File file=new File("e://dog.txt");
       try {
		
    	   //�����ֽ������
    	   FileOutputStream  fos=new FileOutputStream(file);
    	   
    	   //ͨ���ֽ�������������������
    	   ObjectOutputStream oos=new ObjectOutputStream(fos);
       
    	   //��listд���ļ�
    	   oos.writeObject(list);
    	   
    	   oos.close();  //�ر���
    	   fos.close();
       
       } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
		
		
	}

}
