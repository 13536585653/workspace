package java_10;

public class Mythread extends Thread {
	

	public void run(){
		for (int i = 1; i < 100; i++) {
			System.out.println(super.getName()+"-----子线程开启了-----"+i+"次");
		}
		System.out.println(super.getName());
	}
}
