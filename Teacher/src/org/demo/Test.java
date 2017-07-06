package org.demo;

public class Test {
	public static void main(String args[]){
		//下面因为Teacher是抽象类，所以一定不能使用new关键字
		//Teacher t1=new Teacher();
		Teacher t=new NetTeacher();
		t.lesson();
		t.Call();
		
		//将t强转为接口类型
		Interface i=(Interface)t;
		i.Develop();
	}

	
}
