package org.demo.test;

import java.lang.reflect.Constructor;

public class Test5 {
	public static void main(String[] args) throws Exception{
		//获取Class对象
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//从Class对象中获取相应的构造方法
		Constructor<?> cons=clazz.getConstructor();
		//通过这个构造方法的名称（构造方法的名称是跟类名一致的）
		System.out.println(cons.getName());
		//获取构造方法的参数个
		
		
		//获取带参数的构造方法
		Constructor<?> cons2=clazz.getConstructor(String.class,int.class);
		cons2.newInstance("wang",21);
		//UserBean u=new UserBean("wang",21);
		System.out.println(cons2.getParameterTypes());
		System.out.println("---------------------");
		//一次获取所有的构造方法
		Constructor<?>[] conss=clazz.getConstructors();
		for (Constructor<?> constructor : conss) {
			System.out.println(constructor.getName());
		}
	}
}
