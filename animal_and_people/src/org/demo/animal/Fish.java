package org.demo.animal;

public class Fish extends Animal{

	@Override
	public void eat() {
		System.out.println("鱼在吃饲料");
	}

	@Override
	public void call() {
		System.out.println("鱼在哭");
	}

	@Override
	public void Swimming() {
		System.out.println("鱼在游泳");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
