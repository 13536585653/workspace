package test;

import java.util.Random;

public class Ticket implements Runnable{
	
	private int count=100;
	
	public void setCount(int count){
		this.count=count;
	}
	public int getCount(){
		return this.count;
	}
	
	public void sell(){
		if(count<0)
			return;
		else{
			System.out.println(Thread.currentThread().getName()+"¹ºÂòÁËµÚ"+count+"ÕÅÆ±");
			count--;
		}
	}
	public void run(){
		while(count>1){
			try {
				Thread.sleep(new Random().nextInt(1000)+500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sell();
		}
	}
}
