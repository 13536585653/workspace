package 多线程文件复制;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class FileCopy implements Runnable {
	
	
	private File srcFile;
	private File drcFile;
	private long start;
	private long readNum;
	
	
	public FileCopy(File srcFile, File drcFile, long start, long readNum) {
		super();
		this.srcFile = srcFile;
		this.drcFile = drcFile;
		this.start = start;
		this.readNum = readNum;
	}

	//文件复制方法
	public void copy(){
		
		try {
			RandomAccessFile  src=new RandomAccessFile(srcFile, "rw");
			RandomAccessFile  drc=new RandomAccessFile(drcFile, "rw");
			
			src.skipBytes((int) start);  //调整读的起点
			drc.seek(start);   //调整写的起点
			
			long total=0;    //开始读写，读到该读的长度，就结束
			while(true){
				drc.write(src.read());
				total++;
				if(total==readNum)
					break;
			}
		
			src.close();
			drc.close();
		
		System.out.println(Thread.currentThread().getName()+"读写完毕，从"+start+"开始,完成了"+readNum+"字节");	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public void run() {
		copy();
		
	}
	

}
