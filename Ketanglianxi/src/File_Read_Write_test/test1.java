package File_Read_Write_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) {
		File file1=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
		File file2=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\abcd.txt");
			int b;
			try {//�����������������
				FileInputStream fis= new FileInputStream(file1);
				FileOutputStream fos=new FileOutputStream(file2);
				
				while((b=fis.read())!=-1){//�߶�
					fos.write(b);//��д
				}
				
				fis.close();
				fos.close();
				System.out.println("������ϣ���");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
