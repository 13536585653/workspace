package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

	  //��ȡe://a.txt�ļ����� ��ÿ�ζ�ȡ���ֽ�
	 public static void main(String[] args) {
		
		File file=new File("e:\\a.txt");   //�����ļ�����
		
		if(file.exists()){
			
			try {
				//����fileInputStream����
				FileInputStream fis=new FileInputStream(file);
			    int temp;
			    
			    //ͨ��ѭ����ȡ�ļ����ݣ����
				while( (temp=fis.read()) != -1  ){
					char c=(char)temp;   //����ȡ�Ľ��ת��char��
					System.out.print(c);
				}
			
			     fis.close();   //�ر���
			
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}else{
			
			System.out.println("���ļ�������");
		}
		 
	}
	
}
