package org.demo;

public class Security_Door extends Door implements AlarmInterface{

	@Override
	public void Open() {
		System.out.println("防盗门开了");
	}

	@Override
	public void Close() {
		System.out.println("防盗门关了");
	}

	@Override
	public void Alarm() {
		System.out.println("防盗门抱紧了！！");
	}

}
