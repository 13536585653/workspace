package org.demo.people;

import org.demo.Interface.AccrueInterface;
import org.demo.animal.Animal;

public class Woman extends Animal implements AccrueInterface{

	@Override
	public void Accrue() {
		System.out.println("我会生小孩。。。。。");
	}

	@Override
	public void eat() {
		System.out.println("女人在吃饭");
	}

	@Override
	public void call() {
		System.out.println("女人再叫");
	}

	@Override
	public void Swimming() {
		System.out.println("女人在游泳");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	

}
