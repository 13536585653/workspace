package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test5 {
	
	//ʹ�ñ߶�����д������ļ��ĸ���
	public static void main(String[] args) {
		
		File file1=new File("e://abc//yy.exe");
		File file2=new File("e://abc//zz.exe");
		
		try {
			//�����������������
			FileInputStream fis=new FileInputStream(file1);
			FileOutputStream fos=new FileOutputStream(file2);
		    
			int b;  
			  //�߶�
		     while( (b=fis.read())!= -1 ){
		    	 
		    	 fos.write(b);   //��д
		     }
		
		     fis.close();
		     fos.close();
		   
		     System.out.println("�������");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
