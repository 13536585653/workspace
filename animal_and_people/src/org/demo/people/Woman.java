package org.demo.people;

import org.demo.Interface.AccrueInterface;
import org.demo.animal.Animal;

public class Woman extends Animal implements AccrueInterface{

	@Override
	public void Accrue() {
		System.out.println("�һ���С������������");
	}

	@Override
	public void eat() {
		System.out.println("Ů���ڳԷ�");
	}

	@Override
	public void call() {
		System.out.println("Ů���ٽ�");
	}

	@Override
	public void Swimming() {
		System.out.println("Ů������Ӿ");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	

}
