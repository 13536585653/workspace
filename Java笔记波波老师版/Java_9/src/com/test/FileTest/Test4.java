package com.test.FileTest;

import java.io.File;

public class Test4 {
	
	public static void main(String[] args) {
		
		//ͨ���ݹ�����ļ������ȫ������
		String fileName="e://java";
		File file=new File(fileName);
		
		out(file);  
		
		
	}
	
	//�ݹ���ã�����ļ������ȫ������,�����ļ��� 
	public static void out(File file){
		
		if(file!=null){
			if(file.isDirectory()){
				  //�õ��ļ������ȫ���ļ�
				 File[] files=file.listFiles();
				 if(files!=null){
				    for (File f : files) {
					out(f);   //�ݹ����
				    }
				 }
			}else{
				System.out.println(file);
			}
		}
	}
}


