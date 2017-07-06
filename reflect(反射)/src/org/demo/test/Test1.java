package org.demo.test;

public class Test1 {
	
	public static void main(String[] args)throws Exception {
		//加载Class，forName方法的参数必须是一个完整的类名
		//因为jvm（java虚拟机）需要依据包的路径来找到对应的class文件
		//再将这个class文件加载到内存，从而构建一个Class对象
		//不同的class文件加载到内存后就会创建不同的Class对象
		//接下来就可以通过这个Class对象来创建这个类的所有实例
		
		//获取class对象的三种方式
		//方式一
		System.out.println("方式1");
		Class<?> clazz1=Class.forName("org.demo.test.ReflectBean");
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println();
		//方式二
		System.out.println("方式2");
		Class<?> clazz2=ReflectBean.class;
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println();
		//方式三
		System.out.println("方式3");
		ReflectBean rb=new ReflectBean();
		Class<?> clazz3=rb.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
}

}