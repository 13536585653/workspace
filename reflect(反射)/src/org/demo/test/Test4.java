package org.demo.test;

import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args)throws Exception {
		//获取ReflectBean的Class对象
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//创建实例
		Object instance=clazz.newInstance();
		//获取相应的setAge方法
		//参数1：方法的名字     参数2：方法参数的类型
		//返回的是一个封装好的Method对象，用于描述一个方法 的信息
		Method m1=clazz.getMethod("setAge",int.class);
		//可以通过这个method对象来调用具体的方法（回调）
		//invoke方法的第一个参数表示当前类的实例
		//第二个参数就是方法调用时所需要传递的实际参数
		//invoke方法的返回就会说具体调用方法的返回值
		Object returnValue=m1.invoke(instance, 10);
		System.out.println("setAge方法的返回值："+returnValue);
		
		//调用getAge方法，过程同上
		//如果方法没有参数，就不需要指定参数类型
		Method m2=clazz.getMethod("getAge");
		Object returnValues2=m2.invoke(instance);
		System.out.println("getAge方法的返回值："+returnValues2);
		
		System.out.println("---------------");
		//访问和调用私有方法
		Method m3=clazz.getDeclaredMethod("say", String.class);
		//打开访问开关
		m3.setAccessible(true);
		//回调
		m3.invoke(instance, "hello world!");
		System.out.println("----------public修饰的方法-------------");
		//获取所有使用public修饰的方法，包括继承自Object的方法
		Method[] m4=clazz.getMethods();
			for (Method method : m4) {
				System.out.println(method.getName());
			}
		System.out.println("-----------所有方法-------------");
		//获取当前类的所有方法（包括公共和私有的），但是不包括继承自Object的方法
		Method[] m5=clazz.getDeclaredMethods();
			for (Method methods : m5) {
				System.out.println(methods.getName());
			}
	}
}
