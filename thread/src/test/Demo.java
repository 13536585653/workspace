package test;

public class Demo {
	public static void main(String[] args) {
		
		Ticket t=new Ticket();
//		t.setCount(100);
		
		new Thread(t,"消费1").start();
		new Thread(t,"消费2").start();
		new Thread(t,"消费3").start();
		new Thread(t,"消费4").start();
		new Thread(t,"消费5").start();
	}
}
