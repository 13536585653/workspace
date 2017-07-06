package org.demo.test;

import java.lang.reflect.Constructor;

public class Test5 {
	public static void main(String[] args) throws Exception{
		//��ȡClass����
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//��Class�����л�ȡ��Ӧ�Ĺ��췽��
		Constructor<?> cons=clazz.getConstructor();
		//ͨ��������췽�������ƣ����췽���������Ǹ�����һ�µģ�
		System.out.println(cons.getName());
		//��ȡ���췽���Ĳ�����
		
		
		//��ȡ�������Ĺ��췽��
		Constructor<?> cons2=clazz.getConstructor(String.class,int.class);
		cons2.newInstance("wang",21);
		//UserBean u=new UserBean("wang",21);
		System.out.println(cons2.getParameterTypes());
		System.out.println("---------------------");
		//һ�λ�ȡ���еĹ��췽��
		Constructor<?>[] conss=clazz.getConstructors();
		for (Constructor<?> constructor : conss) {
			System.out.println(constructor.getName());
		}
	}
}
