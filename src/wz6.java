
public class wz6 {
	public static void main(String[] args) {
		int total=0;
		for(int i=1;i<=10;i++){
			int sum = 1;
			for(int j=1;j<i;j++){
				sum=sum*j;//求累乘
			}

			System.out.println("1-"+i+"积是"+sum);
			total=total+sum;//将累乘结果累加
		}
			System.out.println("全部的和是"+total);
			
			System.out.println("**********************");
			
	}
		
}
