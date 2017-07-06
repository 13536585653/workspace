package ���߳��ļ�����;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		
		
		File file1=new File("e://abc//yy.exe");
		File file2=new File("e://abc//zz.exe");
		
		long n=file1.length();   //�õ��ļ��ĳ���
		
		System.out.println("Դ�ļ��ܳ���:"+n);
		
		int threadNum=100; //�߳�����
		
		long[] readNums=new long[threadNum];    //ÿ���̶߳�ȡ�ļ��ĳ���
		long[] starts=new long[threadNum]; //ÿ���̶߳�ȡ�ļ������
		
		//��ÿ���̶߳�ȡ�ļ��ĳ���
		for(int i=0;i<threadNum;i++){
			if(i!=threadNum-1)
			  readNums[i]=n/threadNum;
			else
			 readNums[i]=n/threadNum+n%threadNum;	
		}
		
		//��ÿ���̶߳�ȡ�ļ������
		starts[0]=0;
		for(int i=1;i<threadNum;i++){
			starts[i]=starts[i-1]+readNums[i-1];
		}
		
		//�������
		System.out.println("ÿ���̣߳���ȡ�ļ������ͳ���");
		for(int i=0;i<threadNum;i++){
			System.out.println("���"+starts[i]+"-----����:"+readNums[i]);
		}
		
		
		//�����ļ���д�߳�
		Thread[] threads=new Thread[threadNum];
		for(int i=0;i<threadNum;i++){
			
			FileCopy fileCopy=new FileCopy(file1, file2, starts[i], readNums[i]);
			threads[i]=new Thread(fileCopy);
			
			threads[i].start();
		}
			
		
	}

}
