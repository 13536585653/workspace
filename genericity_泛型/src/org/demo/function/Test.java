package org.demo.function;

public class Test {
	public <T> T use(T name){
		System.out.println("���ͷ���");
		return name;
	}
	public Object  use2(Object obj){
		return obj;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		Integer t1=t.use(100);
		String t2=t.use("����");
		Boolean t3=t.use(true);
		
		System.out.println(t1+"--"+t2+"--"+t3);
		System.out.println();
		
		//Object�Ǵ����ͣ�String��С���ͣ�������תС����Ҫ����ǿת��
		String T1=(String)t.use2("�Ϻ�");
		Integer T2=(Integer)t.use2(50);
		Boolean T3=(Boolean)t.use2(false);
		System.out.println(T1+"--"+T2+"--"+T3);
	}
}
