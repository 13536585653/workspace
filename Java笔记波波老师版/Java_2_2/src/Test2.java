import java.util.Scanner;


public class Test2 {
	
	public static void main(String[] args) {
		
	
		    Scanner input=new Scanner(System.in);
		   int x;
		  
		   while(true){
			   
			    System.out.println("请输入一个0-9的数字:");
			    x=input.nextInt();
			   
			    if(x<0 || x>9)
			    	System.out.println("对不起，输入有误！");
			    else
			    	break;
		   }
	
	
		   System.out.println("***********");
		   System.out.println(x);
	}

}
