import java.util.Scanner;


public class Test4 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int x;
		int sum=0;
		
		for(int i=1;i<=10;i++){
			
		  while(true){	
				System.out.println("�������"+i+"����:");
				x=input.nextInt();
				
				if(x<0 ||x>100){
					System.out.println("�����������������!");
				}else
					break;
		   }
			
			sum+=x;     //�ۼ����
		}
		
		System.out.println("����:"+sum);
		System.out.println("ƽ��ֵ��"+sum/10.0);
		
		
		
	}

}
