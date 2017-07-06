package File_Read_Write_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test3 {
	public static void main(String[] args) throws Exception {
		File file=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
		
		try {
			FileReader  fr=new FileReader(file);
			//char[] chars=new char[(int) file.length()];
			//fr.read(chars);
			//for (char c : chars) {
			//	System.out.print(c);
			//}
			
			int c;
			while((c=fr.read())!=-1){
				System.out.print((char)c);
			}
			fr.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
}
