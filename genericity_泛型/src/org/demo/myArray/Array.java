package org.demo.myArray;

public class Array<T> {
	private Object[] array=new Object[10];
	public void add(T value){
		for(int i=0;i<array.length;i++){
			if(array[i]==null){
				array[i]=value;
				break;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		return (T)array[index];
	}
}
