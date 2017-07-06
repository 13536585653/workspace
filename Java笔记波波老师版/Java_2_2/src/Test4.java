import java.util.Scanner;


public class Test4 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int x;
		int sum=0;
		
		for(int i=1;i<=10;i++){
			
		  while(true){	
				System.out.println("请输入第"+i+"个数:");
				x=input.nextInt();
				
				if(x<0 ||x>100){
					System.out.println("输入错误，请重新输入!");
				}else
					break;
		   }
			
			sum+=x;     //累计求和
		}
		
		System.out.println("和是:"+sum);
		System.out.println("平均值是"+sum/10.0);
		
		
		
	}

}
