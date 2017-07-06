package org.demo;

public class Test {
	public static void main(String[] args) {
		Add add=new Add();
		int result= add.calculator(1, 2);
		//调用add的display方法，将值(result)传入Calculator输出
		add.display(result);
	}
}
