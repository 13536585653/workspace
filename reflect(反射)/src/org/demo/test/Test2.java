package org.demo.test;

public class Test2 {
	public static void main(String[] args) throws Exception{
		Class<?> clazz=Class.forName("org.demo.test.ReflectBean");
		//ͨ��Class����������ʵ��
		@SuppressWarnings("unused")
		Object intsance=clazz.newInstance();
		//��ȡ��ǰ������
		String ClassName=clazz.getName();
		System.out.println(ClassName);
		//�鿴����������������
		String simpleName=clazz.getSimpleName();
		System.out.println(simpleName);
		//�鿴�������İ���
		String packageName=clazz.getPackage().getName();
		System.out.println(packageName);
		//�鿴��ĸ��������
		Class<?> superClass=clazz.getSuperclass();
		System.out.println(superClass.getName());
	}
}
