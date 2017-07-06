package FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class test2 {//这个类是一次性输出文件
	public static void main(String[] args) {
		File file=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
		try {
			FileInputStream f=new FileInputStream(file);
			byte[] b=new byte[(int) file.length()];
			f.read(b);
			
			String s=new String(b);
			System.out.println(s);
			f.close();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
