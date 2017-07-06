import java.util.Scanner;


public class TestF {

	public static void main(String[] args) {
		
		char x;
		int z;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("ÇëÊäÈëÄãµÄÑ¡Ôña-d:");
		x=input.next().charAt(0);
		
		switch(x){
		  case 'a': z=1;break;
		  case 'b': z=2;break;
		  case 'c': z=3;break;
		  case 'd': z=4;break;
		  default: z=0;
		}
		
		System.out.println("z="+z);
	}
	
}
