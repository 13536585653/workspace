package org.demo.test;

import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args)throws Exception {
		//��ȡReflectBean��Class����
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//����ʵ��
		Object instance=clazz.newInstance();
		//��ȡ��Ӧ��setAge����
		//����1������������     ����2����������������
		//���ص���һ����װ�õ�Method������������һ������ ����Ϣ
		Method m1=clazz.getMethod("setAge",int.class);
		//����ͨ�����method���������þ���ķ������ص���
		//invoke�����ĵ�һ��������ʾ��ǰ���ʵ��
		//�ڶ����������Ƿ�������ʱ����Ҫ���ݵ�ʵ�ʲ���
		//invoke�����ķ��ؾͻ�˵������÷����ķ���ֵ
		Object returnValue=m1.invoke(instance, 10);
		System.out.println("setAge�����ķ���ֵ��"+returnValue);
		
		//����getAge����������ͬ��
		//�������û�в������Ͳ���Ҫָ����������
		Method m2=clazz.getMethod("getAge");
		Object returnValues2=m2.invoke(instance);
		System.out.println("getAge�����ķ���ֵ��"+returnValues2);
		
		System.out.println("---------------");
		//���ʺ͵���˽�з���
		Method m3=clazz.getDeclaredMethod("say", String.class);
		//�򿪷��ʿ���
		m3.setAccessible(true);
		//�ص�
		m3.invoke(instance, "hello world!");
		System.out.println("----------public���εķ���-------------");
		//��ȡ����ʹ��public���εķ����������̳���Object�ķ���
		Method[] m4=clazz.getMethods();
			for (Method method : m4) {
				System.out.println(method.getName());
			}
		System.out.println("-----------���з���-------------");
		//��ȡ��ǰ������з���������������˽�еģ������ǲ������̳���Object�ķ���
		Method[] m5=clazz.getDeclaredMethods();
			for (Method methods : m5) {
				System.out.println(methods.getName());
			}
	}
}
