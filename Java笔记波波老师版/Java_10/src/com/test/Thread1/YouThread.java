package com.test.Thread1;

public class YouThread  extends Thread{

	 public void run(){
		 
		 for(int i=0;i<=50;i++){
		  System.out.println("第2个要做的事");
		 }
	 }
}
