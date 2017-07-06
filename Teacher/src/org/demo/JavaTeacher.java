package org.demo;

public class JavaTeacher extends Teacher implements Interface{

	@Override
	public void Call() {
		System.out.println("上java课。。。");
	}

	//实现接口中的抽象方法
	@Override
	public void Develop() {
		System.out.println("开发java项目.......");
	}

}
