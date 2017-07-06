package File_Read_Write_test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test2 {
	public static void main(String[] args) {
		File file1=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\abc.txt");
		File file2=new File("E:\\电脑应用程序和软件\\Eclipse\\workspace\\Ketanglianxi\\abc1.txt");
		
		
		try {
			FileReader fr=new FileReader(file1);
			FileWriter fw=new FileWriter(file2);
			
			int b;
			while((b=fr.read())!=-1){
				fw.write(b);
			}
			
			fr.close();
			fw.close();
			
			System.out.println("字符复制完毕！");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
