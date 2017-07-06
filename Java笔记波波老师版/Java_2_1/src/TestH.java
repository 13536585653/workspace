import java.util.Scanner;


public class TestH {

	public static void main(String[] args) {
		
		String s1;
		String s2;
		int x;
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入字符串1:");
		s1=input.nextLine();
		
		System.out.println("请输入整数:");
		x=input.nextInt();
		
		input.nextLine(); //起到清空键盘缓冲字符作用
		
		System.out.println("请输入字符串2:");
		s2=input.nextLine();
		
		System.out.println("s1:"+s1);
		System.out.println("x:"+x);
		System.out.println("s2:"+s2);
		
	}
	
}
