import java.util.Scanner;


public class Test7 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		int[] b={1,2,3,4,5};  //�������飬�����鸳ֵ�������С�͹̶��ˡ�
		
		//�������b
		for(int i=0;i<5;i++){
			System.out.println(b[i]);
		}
		
		System.out.println("********************");
		
		//��������
		int[] a;
		a=new int[5];   //ָ�������С
				
		//ͨ��ѭ��Ϊa���鸳ֵ
		for(int i=0;i<5;i++){
			
			System.out.println("�������"+(i+1)+"����:");
			a[i]=input.nextInt();
			
		}
		
		//�������a
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
		
		
		int[] a1={1,2,3,4,5};
		int[] a2={6,7,8,9,10};
		
		for(int i=0;i<5;i++){
			System.out.println(a1[i]+":"+a2[i]);
			
		}
		
		
	}

}
