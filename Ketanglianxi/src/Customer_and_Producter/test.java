package Customer_and_Producter;

public class test {
	public static void main(String[] args) {
		Store store=new Store();//ʵ����һ���ֿ�
		Customer c=new Customer(store);//ʵ����һ��������
		Producter p=new Producter(store);//ʵ����һ��������
		
		for(int i=1;i<=3;i++){//д��forѭ����ѭ�����
			new Thread(p,"������"+i).start();
		}
		
		for(int i=1;i<=2;i++){//д��forѭ����ѭ�����
			new Thread(c,"������"+i).start();
		}
	}
}
