package File;

import java.io.File;

public class Println_allFile1 {
	public static void main(String[] args) {
		File file=new File("f:\\"+File.separator);//����·��
		print(file);//����ļ��ģ�������
	}

	private static void print(File file) {//�ݹ���ô˷���
		if(file!=null){//�ж�
			if(file.isDirectory()){//�ж��Ƿ�ΪĿ¼
				File[] files=file.listFiles();//�����Ŀ¼���õ��ļ��������ȫ���ļ�
				if(files!=null){//�ж��п����޷��г��ļ��е��ļ�
				for (File file2 : files) {
					print(file2);//�����г�����
				}
				}
			}else{
				System.out.println(file);
			}
		}
	}
}
