package com.test.FileInputStream_FileOutputStream_Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	
	 // ��ȡa.txt���ݣ�һ�ζ�ȡ����ֽ�
	
	public static void main(String[] args) {
		
		File  file=new File("e://a.txt");
		
		try {
			
			//�����ļ�������
			FileInputStream  fis=new FileInputStream(file);
		    //����һ���ֽ����飬��СӦ��Ϊa.txt�ļ��Ĵ�С
			byte[] b=new byte[(int) file.length()];
		
			//һ���ԣ���ȡa.txt �ļ����ݵ��ֽ�����b��
			fis.read(b);
		
			//���ֽ����飬ת��String 
			String s=new String(b);
			
			System.out.println(s);
			
			fis.close();   //�ر���
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
