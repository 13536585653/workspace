package com.test.synchroniczedTest;

public class AAAA {
	
    private boolean flag=true;

	public synchronized void a(){
		
	  while(!flag){
		  
		  try {
	
			  
			  
			  
			  this.wait();   //�Լ���
		  
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  }
	  
	  for(int i=1;i<=10;i++){
			System.out.println("aaaaaaaaaaa");
		}
		System.out.println("************");
		flag=false;
		this.notify();  //���������߳�
	
	 }
	 
	
	
     public synchronized void b() {
    	 
    	 while(flag){
    		 try {
				this.wait();    //�ȴ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
	
		for(int i=1;i<=20;i++){
			System.out.println("bbbbbbbb");
			}
	    System.out.println("************");
	    
	    flag=true;
	    this.notify();   //���������߳�
			
		
	}
}
