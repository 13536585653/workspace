package org.demo.myInterface;

public class MyImplements2<T> implements MyInf<T>{
	
	private T value;

	@Override
	public void set(T value) {
		this.value = value;
		System.out.println("����implements2����");
	}

	@Override
	public T getValue() {
		System.out.println("����implements2����");
		return value;
	}
	
}
