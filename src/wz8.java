import java.util.Scanner;

public class wz8 {
	public static void main(String[] args) {
		String [] name=new String [5];
		int [] a=new int[5];
		int [] b=new int[5];
		int [] c=new int[5];
		
		for(int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"个名字");
			Scanner input=new Scanner(System.in);
			name[i]=input.nextLine();
			System.out.print("请输入第"+(i+1)+"个java成绩");
			a[i]=input.nextInt();
			System.out.print("请输入第"+(i+1)+"个c成绩");
			b[i]=input.nextInt();
			c[i]=(a[i]+b[i])/2;
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.println("姓名为"+name[i]+"的学生  "+";java成绩为："+a[i]+";c成绩为："+b[i]+";平均分为："+c[i]);
		}
	}
}
