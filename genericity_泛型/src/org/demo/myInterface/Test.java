package org.demo.myInterface;

public class Test {
	public static void main(String[] args) {
		/*List<String> list=new ArrayList<String>();
		List��һ���ӿڣ�ArrayList��һ��ʵ���ࡣ*/
		
		MyInf<String> m=new MyImplements1<String>();
		m.set("�Ϻ�");
		String m1=m.getValue();
		System.out.println(m1);
		System.out.println();
		
		MyInf<Integer> n=new MyImplements2<Integer>();
		n.set(5);
		Integer n1=n.getValue();
		System.out.println(n1);
	}
}
