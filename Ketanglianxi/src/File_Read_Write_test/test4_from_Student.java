package File_Read_Write_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class test4_from_Student {
	public static void main(String[] args) {
		File file=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\Student.txt");
		Student s1=new Student("����",18);
		Student s2=new Student("����",21);
		Student s3=new Student("����",38);
		
		
	
			
			try {
				//�����ַ������
				FileOutputStream fos=new FileOutputStream(file);
				//ͨ���ֽ�������������������
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(s1);
				oos.writeObject(s2);
				oos.writeObject(s3);
				
				
				fos.close();
				oos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
	}
}
