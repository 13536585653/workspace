package org.demo.animal;

public class Birds extends Animal{

	@Override
	public void eat() {
		System.out.println("鸟在吃东西");
	}

	@Override
	public void call() {
		System.out.println("鸟在唱歌");
	}

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("鸟在飞");
	}

}
