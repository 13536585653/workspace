package org.demo;

public class JavaTeacher extends Teacher implements Interface{

	@Override
	public void Call() {
		System.out.println("��java�Ρ�����");
	}

	//ʵ�ֽӿ��еĳ��󷽷�
	@Override
	public void Develop() {
		System.out.println("����java��Ŀ.......");
	}

}
