import java.util.Scanner;


public class TestD {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要加密的数字 ：");
		x=input.nextInt();
		
		y=(int)((x*10.5+5)/2+3.14159);
		
		System.out.println("加密后的结果是:"+y);
		
		
		
	}
	
	
}
