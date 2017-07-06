package org.demo;

public class Timber extends Door{

	@Override
	public void Open() {
		System.out.println("木门开了");
	}

	@Override
	public void Close() {
		System.out.println("木门关了");
	}

}
