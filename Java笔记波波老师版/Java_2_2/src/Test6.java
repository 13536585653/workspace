
public class Test6 {
	
	public static void main(String[] args) {
		
		//��1-1�Ļ�
		//��1-2�Ļ�
		//��1-10�Ļ�
		//��ȫ���ۼ�
		int total=0;
			for(int i=1;i<=10;i++){
				
				int sum=1;
				
				for(int j=1;j<=i;j++){
						sum=sum*j;   //���۳�
				}
				
				System.out.println("1-"+i+"����"+sum);
				total=total+sum;  //���۳˽���ۼ�
			}
			
			System.out.println("ȫ���ĺ��� "+total);
	}

}
