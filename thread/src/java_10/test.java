package java_10;

public class test {
	public static void main(String[] args) {
		Thread myThread1=new Mythread();//�������͵��������
		Thread myThread2=new Mythread();//�������͵��������
		Mythread myThread3=new Mythread();//�������͵��������
		
		System.out.println("�߳̿�ʼ��");
		myThread1.start();
		myThread2.start();
		myThread3.start();
		System.out.println("�߳̽�����");
	}
}
