package File;

import java.io.File;

public class Println_allFile {
	public static void main(String[] args) {
		//newһ���ļ�·��
		File file=new File("F:\\"+File.separator);
		String str[]=file.list();//�г�ȫ�����ļ�
		for (int i = 0; i < str.length; i++) {//ѭ������ļ�
			System.out.println(str[i]);
		}
	}
}
