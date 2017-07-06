import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUtil {
	public void Copy(String in,String out){
		//根据路径构建一个文件对象
		File file = new File(in);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
			
				
				
				try {
					//构建一个文件输入流，用于将文件读取到流中
					fis = new FileInputStream(file);
					//构建一个文件输出流，用于将流中的数据写入到目标地址
					fos = new FileOutputStream(out += file.getName());
					int len = 0;
					//一次读写1024个字节
					byte[] b =new byte[1024];
					//在循环中完成具体的 读写操作
					while((len = fis.read( b, 0, b.length))!=-1){
						System.out.println(len);
						fos.write(b, 0, len);
					}
					fis.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		FileCopyUtil fcu = new FileCopyUtil();
		fcu.Copy("F:\\计算机专业学习历史\\java\\workspace\\sublime_text文件\\课堂练习\\aa\\psb.jpg", "F:\\计算机专业学习历史\\java\\workspace\\sublime_text文件\\课堂练习\\bb\\");
	}
}
