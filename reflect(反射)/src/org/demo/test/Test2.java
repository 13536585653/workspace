package org.demo.test;

public class Test2 {
	public static void main(String[] args) throws Exception{
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//通过Class对象来构建实例
		@SuppressWarnings("unused")
		Object intsance=clazz.newInstance();
		//获取当前的类名
		String ClassName=clazz.getName();
		System.out.println(ClassName);
		//查看类名（不带包名）
		String simpleName=clazz.getSimpleName();
		System.out.println(simpleName);
		//查看类所处的包名
		String packageName=clazz.getPackage().getName();
		System.out.println(packageName);
		//查看类的父类的名字
		Class<?> superClass=clazz.getSuperclass();
		System.out.println(superClass.getName());
	}
}
