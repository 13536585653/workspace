import java.util.Scanner;

public class wz4 {
	public static void main(String[] args) {
		int x;
		int sum=0;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"����");
			while(true){
				Scanner input=new Scanner(System.in);
				x=input.nextInt();
				if(x<0||x>=100){
					System.out.println("����������������룡");
				}else  break;
			}
			sum+=x;
			
		}
		System.out.println("�ܷ�Ϊ��"+sum);
		System.out.println("ƽ����Ϊ��"+sum/10.0);
	}
}
