package com.test.StringBufferTest;

public class Test1 {
	
	public static void main(String[] args) {
		StringBuffer  sb=new StringBuffer("abc");
		
		StringBuffer sb1=sb.append("zzz");   //尾部追加
		
		System.out.println(sb);
		System.out.println(sb1);
		
		if(sb==sb1){
			System.out.println("同一个对象");
		}
		
		String s="abc";
		String s1=s+"zzz";
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("******************");

		StringBuffer  sb2=new StringBuffer("abcdef");
		sb2.insert(2, "zzz");
		System.out.println(sb2);   //abzzzcdef
		
		sb2.delete(2, 4);     //azcdef
		
		System.out.println(sb2);
		
		String ss=sb2.toString();
		
	}

}
