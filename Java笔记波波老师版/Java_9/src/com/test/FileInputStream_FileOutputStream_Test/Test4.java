package com.test.FileInputStream_FileOutputStream_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test4 {

	 //�����ļ��Ķ�д�� һ���Զ��꣬��д������ļ��ĸ���
	public static void main(String[] args) {
		
		File file1=new File("e://abc/a.jpg");
		File file2=new File("e://abc/b.jpg");
//		
//		//���b.jpg ,�����ڣ��ʹ�����
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
		//��a.jpg�ļ�������
        try {
			
			//�����ļ�������
			FileInputStream  fis=new FileInputStream(file1);
			//BufferedInputStream bis=new BufferedInputStream(fis);
			
			
			//�����ļ������
			FileOutputStream  fos=new FileOutputStream(file2);
		    //BufferedOutputStream  bos=new BufferedOutputStream(fos);
			//����һ���ֽ����飬��СӦ��Ϊa.jpg�ļ��Ĵ�С
			byte[] b=new byte[(int) file1.length()];
		    
			//һ���ԣ���ȡa.jpg�ļ����ݵ��ֽ�����b��
			fis.read(b);
			//���ֽ�����д���ļ�
            fos.write(b);
		
			//�رն�д
            fis.close();
            fos.close();
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
