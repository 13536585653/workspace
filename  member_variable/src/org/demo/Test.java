package org.demo;

public  class Test {
	static int a=200;
	static int b=200;
	
	static Integer e=200;
	static Integer i=200;
	
	
	public static void main(String[] args) {
		int f=200;
		int j=200;
		
		Integer n=200;
		Integer b=200;
		System.out.println(f==j);
		System.out.println(n==b);
		System.out.println(n.equals(b));
		
		System.out.println();
		System.out.println(a==b);
		System.out.println(e==i);
	}
}
