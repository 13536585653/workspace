package FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class test2 {//�������һ��������ļ�
	public static void main(String[] args) {
		File file=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
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
