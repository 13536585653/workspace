package org.demo.test;

public class Test1 {
	
	public static void main(String[] args)throws Exception {
		//����Class��forName�����Ĳ���������һ������������
		//��Ϊjvm��java���������Ҫ���ݰ���·�����ҵ���Ӧ��class�ļ�
		//�ٽ����class�ļ����ص��ڴ棬�Ӷ�����һ��Class����
		//��ͬ��class�ļ����ص��ڴ��ͻᴴ����ͬ��Class����
		//�������Ϳ���ͨ�����Class��������������������ʵ��
		
		//��ȡclass��������ַ�ʽ
		//��ʽһ
		System.out.println("��ʽ1");
		Class<?> clazz1=Class.forName("org.demo.test.ReflectBean");
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println();
		//��ʽ��
		System.out.println("��ʽ2");
		Class<?> clazz2=ReflectBean.class;
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println();
		//��ʽ��
		System.out.println("��ʽ3");
		ReflectBean rb=new ReflectBean();
		Class<?> clazz3=rb.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
}

}