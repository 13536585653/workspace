import java.util.Scanner;


public class TestE {

	public static void main(String[] args) {
		
		double score;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("������ɼ�:");
		score=input.nextDouble();
		
		String pj="";
		
		if( score<60 ){
			pj="������";
		}else if(score<80){
			pj="����";
		}else if(score<90){
			pj="�е�";
			
		}else{
			pj="����";
		}
		
		System.out.println("��ĵȼ�:"+pj);
		
		
	}
	
}
