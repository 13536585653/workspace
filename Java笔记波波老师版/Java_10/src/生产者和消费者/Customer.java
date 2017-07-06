package 生产者和消费者;

import java.util.Random;

public class Customer implements Runnable {
	
      private Store store;    //消费者的仓库
	
	
	 public Customer(Store store) {
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
			
			store.del();     //不停地从仓库减东西
		}
	}

	 
	 
}
