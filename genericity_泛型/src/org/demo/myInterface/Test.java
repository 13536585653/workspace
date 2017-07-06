package org.demo.myInterface;

public class Test {
	public static void main(String[] args) {
		/*List<String> list=new ArrayList<String>();
		List是一个接口，ArrayList是一个实现类。*/
		
		MyInf<String> m=new MyImplements1<String>();
		m.set("上海");
		String m1=m.getValue();
		System.out.println(m1);
		System.out.println();
		
		MyInf<Integer> n=new MyImplements2<Integer>();
		n.set(5);
		Integer n1=n.getValue();
		System.out.println(n1);
	}
}
