package org.demo;

public  class Son extends Father{
	//��Ա����
	int  age;
	String name;
	//��̬�������ȳ�Ա�����ȼ���
	static String address="�麣";
	//��̬�����
	static{
		System.out.println("��ʼ�����ྲ̬������ִ����son�ľ�̬����顢");
	}
	//��ͨ����
	public void see(){}
	//��̬���������ܵ�����ͨ������ֻ�ܵ��þ�̬����
	public static void eat(){
		System.out.println("son�ڳԶ���");
		run();
		//see();���ܵ�����ͨ����
	}
	public static void run(){
		System.out.println("son�ڱ���");
	}
	//��Ա�����
	{
		System.out.println("sonִ���˳�Ա�����");
	}
	//���췽��
	public Son(){
		System.out.println("sonִ���˹��췽��");
	}
	public static void main(String[] args) {
		Son s=new Son();
		//Son s1=new Son();
		s.address="����";
		Son.address="����";
		s.address="�Ž�";
		s.name="Ԭ��";
		s.age=3;
		System.out.println(Son.address);
		
		Son s1=new Son();
		s1.eat();
		//�������͵�������󣨶�̬������Ϊ�Ǿ�̬���������Բ��߱���̬�ԣ�����Ҳһ����
		Father s2=new Son();
		s2.eat();
	}
}
