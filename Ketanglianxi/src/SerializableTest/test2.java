package SerializableTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import File_Read_Write_test.Student;

public class test2 {
	public static void main(String[] args) {
		Student s1=new Student("张三",22);
		Student s2=new Student("李四",18);
		Student s3=new Student("王五",13);
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		File file=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\Student.txt");
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			oos.close();
			fos.close();
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
