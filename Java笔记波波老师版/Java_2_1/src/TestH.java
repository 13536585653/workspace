import java.util.Scanner;


public class TestH {

	public static void main(String[] args) {
		
		String s1;
		String s2;
		int x;
		Scanner input=new Scanner(System.in);
		
		System.out.println("�������ַ���1:");
		s1=input.nextLine();
		
		System.out.println("����������:");
		x=input.nextInt();
		
		input.nextLine(); //����ռ��̻����ַ�����
		
		System.out.println("�������ַ���2:");
		s2=input.nextLine();
		
		System.out.println("s1:"+s1);
		System.out.println("x:"+x);
		System.out.println("s2:"+s2);
		
	}
	
}
