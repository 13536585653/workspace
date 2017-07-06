import java.util.Scanner;

public class wz4 {
	public static void main(String[] args) {
		int x;
		int sum=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"个数");
			while(true){
				Scanner input=new Scanner(System.in);
				x=input.nextInt();
				if(x<0||x>=100){
					System.out.println("输入错误，请重新输入！");
				}else  break;
			}
			sum+=x;
			
		}
		System.out.println("总分为："+sum);
		System.out.println("平均分为："+sum/10.0);
	}
}
