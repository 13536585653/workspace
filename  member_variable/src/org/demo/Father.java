package org.demo;

public class Father {
	int age;
	String name;
	static String address;
	
	//��̬�����
	static{
		System.out.println("��ʼ����Ա������ִ����father�ľ�̬�����");
	}
	//��Ա�����
	{
		System.out.println("ִ����father�ĳ�Ա�����");
	}
	//���췽��
	public  Father(){
		super();
		System.out.println("ִ����father�Ĺ��췽��");
	}
	//��̬����
	public static void eat(){
		System.out.println("father�ڳԶ���");
	}
	public static void main(String[] args) {
		//ͨ��������ֱ�ӵ���
		eat();
		//ͨ����������
		Father.eat();
		
	}
}
