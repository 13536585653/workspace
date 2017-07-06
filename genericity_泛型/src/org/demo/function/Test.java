package org.demo.function;

public class Test {
	public <T> T use(T name){
		System.out.println("泛型方法");
		return name;
	}
	public Object  use2(Object obj){
		return obj;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		Integer t1=t.use(100);
		String t2=t.use("杭州");
		Boolean t3=t.use(true);
		
		System.out.println(t1+"--"+t2+"--"+t3);
		System.out.println();
		
		//Object是大类型，String是小类型，大类型转小类型要进行强转。
		String T1=(String)t.use2("上海");
		Integer T2=(Integer)t.use2(50);
		Boolean T3=(Boolean)t.use2(false);
		System.out.println(T1+"--"+T2+"--"+T3);
	}
}
