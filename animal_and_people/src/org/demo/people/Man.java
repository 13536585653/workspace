package org.demo.people;

import org.demo.animal.Animal;

public class Man extends Animal{

	@Override
	public void eat() {
		System.out.println("男人在吃饭");
	}

	@Override
	public void call() {
		System.out.println("男人再叫");
	}

	@Override
	public void Swimming() {
		System.out.println("男人在游泳");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
	
}
