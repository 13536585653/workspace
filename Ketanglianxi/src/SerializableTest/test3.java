package SerializableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class test3 {
	public static void main(String[] args) {
		File file=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\Student.txt");
		
		
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);

			try {
				List list=(List)ois.readObject();
				fis.close();
				ois.close();
				System.out.println(list);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
