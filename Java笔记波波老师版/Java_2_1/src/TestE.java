import java.util.Scanner;


public class TestE {

	public static void main(String[] args) {
		
		double score;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入成绩:");
		score=input.nextDouble();
		
		String pj="";
		
		if( score<60 ){
			pj="不及格";
		}else if(score<80){
			pj="及格";
		}else if(score<90){
			pj="中等";
			
		}else{
			pj="优秀";
		}
		
		System.out.println("你的等级:"+pj);
		
		
	}
	
}
