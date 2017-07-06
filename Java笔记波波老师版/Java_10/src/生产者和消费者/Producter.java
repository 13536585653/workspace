package 生产者和消费者;

import java.util.Random;

public class Producter implements Runnable {

	 //生产者类
	
	private Store store;    //生产者的仓库
	
	
	public Producter(Store store) {
		super();
		this.store = store;
	}


	@Override
	public void run() {
		while(true){
			
			try {
				Thread.sleep(new Random().nextInt(1000)*2+500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			store.add();     //不停的往仓库添加东西
		}
	}
	
	
   
	
	
}
