package Thread;

public class test {
	public static void main(String[] args) {
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Thread th=new Thread(dog1,"线程开启了");
		Thread th1=new Thread(dog2,"线程2开启了");
		System.out.println("线程开启了");
		th.start();
		th1.start();
		System.out.println("线程结束了");
	}
}
