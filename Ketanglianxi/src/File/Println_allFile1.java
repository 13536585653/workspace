package File;

import java.io.File;

public class Println_allFile1 {
	public static void main(String[] args) {
		File file=new File("f:\\"+File.separator);//操作路径
		print(file);//输出文件的（方法）
	}

	private static void print(File file) {//递归调用此方法
		if(file!=null){//判断
			if(file.isDirectory()){//判断是否为目录
				File[] files=file.listFiles();//如果是目录，得到文件夹里面的全部文件
				if(files!=null){//判断有可能无法列出文件中的文件
				for (File file2 : files) {
					print(file2);//持续列出内容
				}
				}
			}else{
				System.out.println(file);
			}
		}
	}
}
