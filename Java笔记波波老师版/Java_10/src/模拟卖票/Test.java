package Ä£ÄâÂôÆ±;

public class Test {
	
	public static void main(String[] args) {
		
		final Ticket t=new Ticket();
		t.setCount(100);   //100ÕÅÆ±
		
		/*
		Thread th1=new Thread(t);
		th1.start();
		
		Thread th2=new Thread(t);
		th2.start();
		
		Thread th3=new Thread(t);
		th3.start();
		*/
		
		for(int i=1;i<=3;i++){
			new Thread(t).start();
		}
		
		
		
	
	}

}
