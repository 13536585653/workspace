package org.demo.myArray;

//����һ��������
public class UserBean <T>{
	private T value;
	
	//����set����
	public void setvalue(T value){
		this.value=value;
	}
	//����get����
	public T getvalue(){
		return value;
	}
}
