package �����ߺ�������;

public class Test {
	
	public static void main(String[] args) {
		
		Store  store=new Store();   //�����ֿ�
		
		Producter  p=new Producter(store);   //����������
		Customer   c=new Customer(store);     //����������
		
		
		//3���������߳�
		for(int i=1;i<=3;i++){
			new Thread(p,"������"+i).start();
		}
	
		//2���������߳�
		for(int i=1;i<=2;i++){
			new Thread(c,"������"+i).start();
	    }
		
	}

}
