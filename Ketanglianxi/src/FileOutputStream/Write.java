package FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
	public static void main(String[] args) {
		File file=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
		
		try {
			FileOutputStream f=new FileOutputStream(file);
			String s="СС��   hello world";
			byte b[]=s.getBytes();
			try {
				f.write(b);
				f.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
