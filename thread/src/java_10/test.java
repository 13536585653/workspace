package java_10;

public class test {
	public static void main(String[] args) {
		Thread myThread1=new Mythread();//父类类型的子类对象
		Thread myThread2=new Mythread();//父类类型的子类对象
		Mythread myThread3=new Mythread();//子类类型的子类对象
		
		System.out.println("线程开始了");
		myThread1.start();
		myThread2.start();
		myThread3.start();
		System.out.println("线程结束了");
	}
}
