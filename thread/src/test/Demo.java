package test;

public class Demo {
	public static void main(String[] args) {
		
		Ticket t=new Ticket();
//		t.setCount(100);
		
		new Thread(t,"����1").start();
		new Thread(t,"����2").start();
		new Thread(t,"����3").start();
		new Thread(t,"����4").start();
		new Thread(t,"����5").start();
	}
}
