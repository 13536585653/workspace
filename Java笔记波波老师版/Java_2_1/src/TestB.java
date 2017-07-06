import java.util.Scanner;


public class TestB {

	public static void main(String[] args) {
		
//			int x;
//			double y;
//			
//			
//			//产生一个输入对象,必须导入java.util.Scanner
          Scanner input=new Scanner(System.in);
//			
//			
//			System.out.print("请输入x的值:");
//			x=input.nextInt(); //从键盘输入x的值
//			
//			System.out.print("请输入y的值:");
//			y=input.nextDouble(); //从键盘输入y的值
//			
//			
//			//输出
//			System.out.println("x:"+x);
//			System.out.println("y:"+y);
//			
//			
		String  name;
		System.out.print("请输入姓名:");
	
		//name=input.next();   //输入字符串，不含空格
		name=input.nextLine();  //输入字符串，含空格
		
		System.out.println("姓名:"+name);
		
		
	}
	
	
}
