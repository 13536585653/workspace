
public class Test {
	
	public static void main(String[] args) {
		
		String s=new String("good");
		char[] ch={'a','b','c'};
		f(s,ch);
		
		System.out.println(s);
		System.out.println(ch);

	
	}

	public static void f(String s,char[] ch){
		s="test ok";
		ch[0]='g';
	}
	
}
