import java.util.Scanner;


public class Test8 {
	
	public static void main(String[] args) {
		
		Scanner input=new  Scanner(System.in);
		
		//String���͵�����
		String[]  names=new String[5];
		
		//ѭ������5��ѧԱ����
		for(int i=0;i<5;i++){
			System.out.println("�������"+(i+1)+"��ѧԱ����:");
			names[i]=input.nextLine();
		}
		
		//ѭ�����5��ѧԱ����
		for(int i=0;i<5;i++){
			System.out.println(names[i]);
		}
		
	}

}
