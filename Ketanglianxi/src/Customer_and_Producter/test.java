package Customer_and_Producter;

public class test {
	public static void main(String[] args) {
		Store store=new Store();//实例化一个仓库
		Customer c=new Customer(store);//实例化一个消费者
		Producter p=new Producter(store);//实例化一个生产者
		
		for(int i=1;i<=3;i++){//写个for循环，循环输出
			new Thread(p,"生产者"+i).start();
		}
		
		for(int i=1;i<=2;i++){//写个for循环，循环输出
			new Thread(c,"消费者"+i).start();
		}
	}
}
