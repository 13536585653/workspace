package org.demo.test;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args)throws Exception{
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//����ʵ��
		Object instance=clazz.newInstance();
		//�����е�����
		//��ȡage���ԣ���������������
		//���صľ���һ��Field���ͣ����Field�ʹ������е�����
		//���Field���Ƕ�age���Եķ�װ
		Field f1=clazz.getField("age");
		//��ȡ���Ե�ֵ
		int value = f1.getInt(instance);
		System.out.println(value);
		//�����Ը�ֵ
		f1.set(instance, 5);
		System.out.println(f1.getInt(instance));
		System.out.println("---------------------");
		
		//����˽������
		//f2���Ƕ�userName���Եķ�װ
		Field f2 =clazz.getDeclaredField("reflectName");
		//��˽�����Ը�ֵ
		//�ڸ�ֵ֮ǰҪ��ǿ�ƴ򿪷��ʿ���
		f2.setAccessible(true);
		//��ֵ����
		f2.set(instance, "����1");
		System.out.println(f2.get(instance));
		System.out.println("-----------------");
		//һ�λ�ȡ����ʹ��public���ε�����
		Field[] fields=clazz.getFields();
			for (Field field : fields) {
				System.out.println(field.getName());
			}
			
		System.out.println("--------------------");
		//һ���Ի�ȡ���е�����
		Field[] field2=clazz.getDeclaredFields();
		for (Field field : field2) {
			System.out.println(field.getName());
		}
	}
}
