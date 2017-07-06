package com.test.RandomTest;

import java.util.Random;

public class Test1 {
	
	public static void main(String[] args) {
		
		Random  random=new Random(); //产生一个随机数对象
		
		int x=random.nextInt();
		double y=random.nextDouble();
		float z=random.nextFloat();
		
	
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
		
		//产生一个0-100的随机整数
		
		int n=random.nextInt(101);
		System.out.println(n);
		
	}

}
