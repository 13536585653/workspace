package FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_and_read {
	public static void main(String[] args) {
		File file=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\��дͼƬ\\a.jpg");
		File file1=new File("E:\\����Ӧ�ó�������\\Eclipse\\workspace\\Ketanglianxi\\��дͼƬ\\b.jpg");
		
		if(!file1.exists()){
			try {
				file1.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			try {
				FileInputStream  fis=new FileInputStream(file);
				FileOutputStream fom=new FileOutputStream(file1);
				byte[]b=new byte[(int) file.length()];
				try {
					fis.read(b);
					fom.write(b);
					fis.close();
					fom.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
