import java.util.Scanner;


public class Test7 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		int[] b={1,2,3,4,5};  //声明数组，并数组赋值，数组大小就固定了。
		
		//输出数组b
		for(int i=0;i<5;i++){
			System.out.println(b[i]);
		}
		
		System.out.println("********************");
		
		//声明数组
		int[] a;
		a=new int[5];   //指定数组大小
				
		//通过循环为a数组赋值
		for(int i=0;i<5;i++){
			
			System.out.println("请输入第"+(i+1)+"个数:");
			a[i]=input.nextInt();
			
		}
		
		//输出数组a
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
		
		
		int[] a1={1,2,3,4,5};
		int[] a2={6,7,8,9,10};
		
		for(int i=0;i<5;i++){
			System.out.println(a1[i]+":"+a2[i]);
			
		}
		
		
	}

}
