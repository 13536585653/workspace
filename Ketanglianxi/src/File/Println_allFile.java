package File;

import java.io.File;

public class Println_allFile {
	public static void main(String[] args) {
		//new一个文件路径
		File file=new File("F:\\"+File.separator);
		String str[]=file.list();//列出全部的文件
		for (int i = 0; i < str.length; i++) {//循环输出文件
			System.out.println(str[i]);
		}
	}
}
