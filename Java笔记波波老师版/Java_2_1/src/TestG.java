import java.util.Scanner;


public class TestG {
	
	public static void main(String[] args) {
		
		int n;  //����
		double price;  //����
		char vip;   //�Ƿ��Ա y/n
		
		double sum;  //�ϼ�
		double zk;   //�ۿ�
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("��������Ʒ����:");
		price=input.nextDouble();
		System.out.print("��������Ʒ����:");
		n=input.nextInt();
		
		System.out.print("�Ƿ��Ա��y/n:");
		vip=input.next().charAt(0);
		
		if(vip=='y'){
			zk=0.9;   //��9��
		}else{
			zk=1;     //������
		}
		
		sum=n*price;   //����ϼ�
		
		int m=0;  //������
		
		m=(int)sum/1000*100;  //�������
		
		System.out.println("Ӧ�����Ϊ:"+sum);
		System.out.println("����Ϊ:"+m);
		System.out.println("��Ա�ۿ�Ϊ:"+(sum-m)*(1-zk));
		System.out.println("ʵ�����Ϊ:"+(sum-m)*zk);
	}

}
