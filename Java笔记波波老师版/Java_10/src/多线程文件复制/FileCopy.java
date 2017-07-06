package ���߳��ļ�����;

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

	//�ļ����Ʒ���
	public void copy(){
		
		try {
			RandomAccessFile  src=new RandomAccessFile(srcFile, "rw");
			RandomAccessFile  drc=new RandomAccessFile(drcFile, "rw");
			
			src.skipBytes((int) start);  //�����������
			drc.seek(start);   //����д�����
			
			long total=0;    //��ʼ��д�������ö��ĳ��ȣ��ͽ���
			while(true){
				drc.write(src.read());
				total++;
				if(total==readNum)
					break;
			}
		
			src.close();
			drc.close();
		
		System.out.println(Thread.currentThread().getName()+"��д��ϣ���"+start+"��ʼ,�����"+readNum+"�ֽ�");	
		
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
