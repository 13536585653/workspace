import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUtil {
	public void Copy(String in,String out){
		//����·������һ���ļ�����
		File file = new File(in);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
			
				
				
				try {
					//����һ���ļ������������ڽ��ļ���ȡ������
					fis = new FileInputStream(file);
					//����һ���ļ�����������ڽ����е�����д�뵽Ŀ���ַ
					fos = new FileOutputStream(out += file.getName());
					int len = 0;
					//һ�ζ�д1024���ֽ�
					byte[] b =new byte[1024];
					//��ѭ������ɾ���� ��д����
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
		fcu.Copy("F:\\�����רҵѧϰ��ʷ\\java\\workspace\\sublime_text�ļ�\\������ϰ\\aa\\psb.jpg", "F:\\�����רҵѧϰ��ʷ\\java\\workspace\\sublime_text�ļ�\\������ϰ\\bb\\");
	}
}
