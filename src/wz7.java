import java.util.Scanner;

public class wz7 {
	public static void main(String[] args) {
		double [] a=new double [5];
		//double [] a;new double [5];
		//ͨ��ѭ��Ϊa���鸳ֵ
		for(int i=0;i<5;i++){
			System.out.println("�������"+i+"����");
			Scanner input=new Scanner(System.in);
			a[i]=input.nextDouble();
		}
		
		//�������a
		int sum = 0;
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
			sum+=i;
		}
		
		System.out.println("�ܺ�Ϊ��"+sum);
		System.out.println("���������ƽ��ֵΪ��"+sum/5);
	}
}
