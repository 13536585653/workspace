import java.util.Scanner;


public class TestD {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner input=new Scanner(System.in);
		System.out.println("������Ҫ���ܵ����� ��");
		x=input.nextInt();
		
		y=(int)((x*10.5+5)/2+3.14159);
		
		System.out.println("���ܺ�Ľ����:"+y);
		
		
		
	}
	
	
}
