package org.demo.myArray;

public class Test {
	public static void main(String[] args) {
		/*UserBean<String> user = new UserBean<String>();
		user.setvalue("�¿�");
		String u=user.getvalue();
		System.out.println(u);
		
		UserBean<Integer> user1=new UserBean<Integer>();
		user1.setvalue(100);
		Integer i=user1.getvalue();
		System.out.println(i);
		
		UserBean<Double> user2=new UserBean<Double>();
		user2.setvalue(5.5);
		Double d=user2.getvalue();
		System.out.println(d);*/
		
		//ָ������ΪString
		Array<String> a=new Array<String>();
		a.add("���");
		a.add("�Ϻ�");
		a.add("����");
		
		String a1=a.get(0);
		String a2=a.get(1);
		String a3=a.get(2);
		String a4=a.get(6);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println();
		
		//ָ������ΪInteger
		Array<Integer> array=new Array<Integer>();
		array.add(100);
		array.add(200);
		
		Integer i1=array.get(0);
		Integer i2=array.get(1);
		System.out.println(i1);
		System.out.println(i2);
	}
}
