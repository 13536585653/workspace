package org.demo.test;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args)throws Exception{
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//创建实例
		Object instance=clazz.newInstance();
		//获类中的属性
		//获取age属性，参数就是属性名
		//返回的就是一个Field类型，这个Field就代表类中的属性
		//这个Field就是对age属性的封装
		Field f1=clazz.getField("age");
		//获取属性的值
		int value = f1.getInt(instance);
		System.out.println(value);
		//给属性赋值
		f1.set(instance, 5);
		System.out.println(f1.getInt(instance));
		System.out.println("---------------------");
		
		//访问私有属性
		//f2就是对userName属性的封装
		Field f2 =clazz.getDeclaredField("reflectName");
		//给私有属性赋值
		//在赋值之前要先强制打开访问开关
		f2.setAccessible(true);
		//赋值操作
		f2.set(instance, "反射1");
		System.out.println(f2.get(instance));
		System.out.println("-----------------");
		//一次获取所有使用public修饰的属性
		Field[] fields=clazz.getFields();
			for (Field field : fields) {
				System.out.println(field.getName());
			}
			
		System.out.println("--------------------");
		//一次性获取所有的属性
		Field[] field2=clazz.getDeclaredFields();
		for (Field field : field2) {
			System.out.println(field.getName());
		}
	}
}
