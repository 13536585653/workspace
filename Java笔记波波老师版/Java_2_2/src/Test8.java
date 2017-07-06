import java.util.Scanner;


public class Test8 {
	
	public static void main(String[] args) {
		
		Scanner input=new  Scanner(System.in);
		
		//String类型的数组
		String[]  names=new String[5];
		
		//循环输入5个学员姓名
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"个学员姓名:");
			names[i]=input.nextLine();
		}
		
		//循环输出5个学员姓名
		for(int i=0;i<5;i++){
			System.out.println(names[i]);
		}
		
	}

}
