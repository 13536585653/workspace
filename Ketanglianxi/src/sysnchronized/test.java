package sysnchronized;

public class test {
	public static void main(String[] args) {
		Ticket t=new Ticket();
		t.setCount(100);
		
		Thread t1=new Thread(t);
		t1.start();
		
		Thread t2=new Thread(t);
		t2.start();
		
		Thread t3=new Thread(t);
		t3.start();
	}
}
