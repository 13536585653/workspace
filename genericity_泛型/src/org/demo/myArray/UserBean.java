package org.demo.myArray;

//这是一个泛型类
public class UserBean <T>{
	private T value;
	
	//泛型set方法
	public void setvalue(T value){
		this.value=value;
	}
	//泛型get方法
	public T getvalue(){
		return value;
	}
}
