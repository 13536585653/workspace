import java.util.Scanner;


public class Test2 {
	
	public static void main(String[] args) {
		
	
		    Scanner input=new Scanner(System.in);
		   int x;
		  
		   while(true){
			   
			    System.out.println("������һ��0-9������:");
			    x=input.nextInt();
			   
			    if(x<0 || x>9)
			    	System.out.println("�Բ�����������");
			    else
			    	break;
		   }
	
	
		   System.out.println("***********");
		   System.out.println(x);
	}

}
