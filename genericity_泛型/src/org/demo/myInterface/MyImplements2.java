package org.demo.myInterface;

public class MyImplements2<T> implements MyInf<T>{
	
	private T value;

	@Override
	public void set(T value) {
		this.value = value;
		System.out.println("泛型implements2方法");
	}

	@Override
	public T getValue() {
		System.out.println("泛型implements2方法");
		return value;
	}
	
}
