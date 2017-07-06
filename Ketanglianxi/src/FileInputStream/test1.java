package FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test1 {
	public static void main(String[] args) {
		File file=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
		try {
			FileInputStream f=new FileInputStream(file);
			byte b[]=new byte[(int) file.length()];
			int temp;
			while ((temp=f.read())!=-1) {
				char c=(char)temp;
				System.out.print(c);
			}
			f.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
