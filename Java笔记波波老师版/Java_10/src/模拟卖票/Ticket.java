package 模拟卖票;

import java.util.Random;

public class Ticket  implements Runnable{

	 //票类
	private int count; //票数
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	//卖票方法 ,卖1张票
	public synchronized void sell(){
		if(count<=0)
			  return ;  //结束方法
		 else{
		    System.out.println(Thread.currentThread().getName()+"卖票:"+count);
		    count--;
		 }
	}

	@Override
	public void run() {
		
		//不停地卖票，直到票数为0
		
		
		while(count>0){
			
			
			 try {
					
				 Thread.sleep(new Random().nextInt(1000)*2+1000);
			
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 sell(); 
		}
			
		
		System.out.println(Thread.currentThread().getName()+"票已卖完");
	   
	
	} 	
		
	
	
}
