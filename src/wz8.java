import java.util.Scanner;

public class wz8 {
	public static void main(String[] args) {
		String [] name=new String [5];
		int [] a=new int[5];
		int [] b=new int[5];
		int [] c=new int[5];
		
		for(int i=0;i<5;i++){
			System.out.print("�������"+(i+1)+"������");
			Scanner input=new Scanner(System.in);
			name[i]=input.nextLine();
			System.out.print("�������"+(i+1)+"��java�ɼ�");
			a[i]=input.nextInt();
			System.out.print("�������"+(i+1)+"��c�ɼ�");
			b[i]=input.nextInt();
			c[i]=(a[i]+b[i])/2;
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.println("����Ϊ"+name[i]+"��ѧ��  "+";java�ɼ�Ϊ��"+a[i]+";c�ɼ�Ϊ��"+b[i]+";ƽ����Ϊ��"+c[i]);
		}
	}
}
