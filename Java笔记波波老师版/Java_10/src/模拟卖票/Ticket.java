package ģ����Ʊ;

import java.util.Random;

public class Ticket  implements Runnable{

	 //Ʊ��
	private int count; //Ʊ��
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	//��Ʊ���� ,��1��Ʊ
	public synchronized void sell(){
		if(count<=0)
			  return ;  //��������
		 else{
		    System.out.println(Thread.currentThread().getName()+"��Ʊ:"+count);
		    count--;
		 }
	}

	@Override
	public void run() {
		
		//��ͣ����Ʊ��ֱ��Ʊ��Ϊ0
		
		
		while(count>0){
			
			
			 try {
					
				 Thread.sleep(new Random().nextInt(1000)*2+1000);
			
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 sell(); 
		}
			
		
		System.out.println(Thread.currentThread().getName()+"Ʊ������");
	   
	
	} 	
		
	
	
}
