package 多线程文件复制;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		
		
		File file1=new File("e://abc//yy.exe");
		File file2=new File("e://abc//zz.exe");
		
		long n=file1.length();   //得到文件的长度
		
		System.out.println("源文件总长度:"+n);
		
		int threadNum=100; //线程数量
		
		long[] readNums=new long[threadNum];    //每个线程读取文件的长度
		long[] starts=new long[threadNum]; //每个线程读取文件的起点
		
		//算每个线程读取文件的长度
		for(int i=0;i<threadNum;i++){
			if(i!=threadNum-1)
			  readNums[i]=n/threadNum;
			else
			 readNums[i]=n/threadNum+n%threadNum;	
		}
		
		//算每个线程读取文件的起点
		starts[0]=0;
		for(int i=1;i<threadNum;i++){
			starts[i]=starts[i-1]+readNums[i-1];
		}
		
		//测试输出
		System.out.println("每个线程，读取文件的起点和长度");
		for(int i=0;i<threadNum;i++){
			System.out.println("起点"+starts[i]+"-----长度:"+readNums[i]);
		}
		
		
		//创建文件读写线程
		Thread[] threads=new Thread[threadNum];
		for(int i=0;i<threadNum;i++){
			
			FileCopy fileCopy=new FileCopy(file1, file2, starts[i], readNums[i]);
			threads[i]=new Thread(fileCopy);
			
			threads[i].start();
		}
			
		
	}

}
