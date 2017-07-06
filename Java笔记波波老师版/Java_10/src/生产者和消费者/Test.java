package 生产者和消费者;

public class Test {
	
	public static void main(String[] args) {
		
		Store  store=new Store();   //创建仓库
		
		Producter  p=new Producter(store);   //创建生产者
		Customer   c=new Customer(store);     //创建消费者
		
		
		//3个生产者线程
		for(int i=1;i<=3;i++){
			new Thread(p,"生产者"+i).start();
		}
	
		//2个消费者线程
		for(int i=1;i<=2;i++){
			new Thread(c,"消费者"+i).start();
	    }
		
	}

}
