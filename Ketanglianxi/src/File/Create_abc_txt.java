package File;

import java.io.File;
import java.io.IOException;

public class Create_abc_txt {
	public static void main(String[] args) {
		String fileName="f:\\abc.txt";
		File file=new File(fileName);
		if(file.exists()){
			System.out.println("���ļ��Ѵ��ڣ�");
			file.delete();
		}else{
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
