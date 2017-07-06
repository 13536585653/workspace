import java.util.Scanner;

public class wz7 {
	public static void main(String[] args) {
		double [] a=new double [5];
		//double [] a;new double [5];
		//通过循环为a数组赋值
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+i+"个数");
			Scanner input=new Scanner(System.in);
			a[i]=input.nextDouble();
		}
		
		//输出数组a
		int sum = 0;
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
			sum+=i;
		}
		
		System.out.println("总和为："+sum);
		System.out.println("这五个数的平均值为："+sum/5);
	}
}
