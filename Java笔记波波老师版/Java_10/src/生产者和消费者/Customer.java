package �����ߺ�������;

import java.util.Random;

public class Customer implements Runnable {
	
      private Store store;    //�����ߵĲֿ�
	
	
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
			
			store.del();     //��ͣ�شӲֿ������
		}
	}

	 
	 
}
