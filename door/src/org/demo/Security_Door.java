package org.demo;

public class Security_Door extends Door implements AlarmInterface{

	@Override
	public void Open() {
		System.out.println("�����ſ���");
	}

	@Override
	public void Close() {
		System.out.println("�����Ź���");
	}

	@Override
	public void Alarm() {
		System.out.println("�����ű����ˣ���");
	}

}
