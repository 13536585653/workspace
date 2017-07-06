import java.util.Arrays;
import java.util.Scanner;


public class Test10 {
	
	public static void main(String[] args) {
		
	   //二维数组
		int[][] a=new int[3][5];
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<5;j++){
				
				System.out.println("请输入a["+i+"]["+j+"]:");
				a[i][j]=input.nextInt();
				
			}
		}
		
		System.out.println("****输入完毕*****");
		
         for(int i=0;i<a.length;i++){
			
			for(int j=0;j<5;j++){
				
				System.out.print(a[i][j]+" ");
				
			}
			
			System.out.println();
		} 
		
	
	}
	

}
