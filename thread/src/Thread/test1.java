package Thread;
//��õ��߳�
public class test1 {
	public static void main(String[] args) {
		Thread th=new Thread(new Runnable() {
			
			@Override
			//��һ���̸߳ɵ���
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("*******"+Thread.currentThread().getName()+"********"+i+"��");
				}
			}
		},"hihi�߳�");
		
		//�ڶ����̸߳ɵ���
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("�������У�������"+Thread.currentThread().getName()+i+"������");
				}
				
			}
		});
		th.start();
		th1.start();
}
}