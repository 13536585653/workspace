package com.test.SerializableTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) {
		
		Dog dog=new Dog("С��",2);
				
       File file=new File("e://dog.txt");
       try {
		
    	   //�����ֽ������
    	   FileOutputStream  fos=new FileOutputStream(file);
    	   
    	   //ͨ���ֽ�������������������
    	   ObjectOutputStream oos=new ObjectOutputStream(fos);
       
    	   //������д���ļ�
    	   oos.writeObject(dog);
    	   
    	   oos.close();  //�ر���
    	   fos.close();
       
       } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
		
		
	}

}
