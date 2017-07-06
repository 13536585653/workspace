package org.demo.function;

public class TestVarargs {
	//���ʹ����
	@SuppressWarnings("unchecked")
	public <T> T say(T...t){
		for (T t2 : t) {
			System.out.print("--"+t2);
			System.out.println();
		}
		return null;
	}
	
	public void say2(Object...t){
		for (Object o : t) {
			System.out.print("--"+o);
			System.out.println();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TestVarargs tv=new TestVarargs();
		tv.say(3,"����",true,5.5);
		System.out.println();
		tv.say2(3,"��ٸ�",false,22);
	}
}
