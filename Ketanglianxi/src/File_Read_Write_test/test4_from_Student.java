package File_Read_Write_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class test4_from_Student {
	public static void main(String[] args) {
		File file=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\Student.txt");
		Student s1=new Student("张三",18);
		Student s2=new Student("李四",21);
		Student s3=new Student("王五",38);
		
		
	
			
			try {
				//创建字符输出流
				FileOutputStream fos=new FileOutputStream(file);
				//通过字节输出流创建对象输出流
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
