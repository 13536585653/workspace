
public class Test3 {
	
	public static void main(String[] args) {
		
		//算1-100偶数的和
		int sum=0;  
		
		for(int i=1;i<=100;i++){
			
			if(i%2==1)
				continue;
			
			sum+=i;
		}
		
		System.out.println("和是"+sum);
		
	}

}
