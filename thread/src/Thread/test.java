package Thread;

public class test {
	public static void main(String[] args) {
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Thread th=new Thread(dog1,"�߳̿�����");
		Thread th1=new Thread(dog2,"�߳�2������");
		System.out.println("�߳̿�����");
		th.start();
		th1.start();
		System.out.println("�߳̽�����");
	}
}
