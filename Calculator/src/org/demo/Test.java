package org.demo;

public class Test {
	public static void main(String[] args) {
		Add add=new Add();
		int result= add.calculator(1, 2);
		//����add��display��������ֵ(result)����Calculator���
		add.display(result);
	}
}
