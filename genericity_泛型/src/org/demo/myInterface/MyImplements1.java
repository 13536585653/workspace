package org.demo.myInterface;


public class MyImplements1<T> implements MyInf<T>{
	private T value;
	@Override
	public void set(T value) {
		this.value =value;
		System.out.println("泛型implements1方法");
	}

	@Override
	public T getValue() {
		System.out.println("泛型implements1方法");
		return value;
	}
}
