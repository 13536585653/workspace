package com.test.RandomTest;

import java.util.Random;

public class Test2 {

	//����10�� 5-10�������
	public static void main(String[] args) {
		Random random=new Random();
		int n;
		for(int i=1;i<=10;i++){
			
			n=random.nextInt(6)+5;
			System.out.println(n);
		}
		
	}
}
