package Thread;
//最常用的线程
public class test1 {
	public static void main(String[] args) {
		Thread th=new Thread(new Runnable() {
			
			@Override
			//第一个线程干的事
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("*******"+Thread.currentThread().getName()+"********"+i+"次");
				}
			}
		},"hihi线程");
		
		//第二个线程干的事
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("我是旺仔！！！！"+Thread.currentThread().getName()+i+"个旺仔");
				}
				
			}
		});
		th.start();
		th1.start();
}
}