package org.demo.test;

import org.demo.Interface.AccrueInterface;
import org.demo.animal.Animal;
import org.demo.animal.Birds;
import org.demo.people.Woman;

public class Test {
	public static void main(String args[]){
		
		Animal w=new Woman();
		w.eat();
		w.call();
		//父类类型的子类对象，当要转换接口时必须 使用强转。
		AccrueInterface a=(AccrueInterface)w;
		a.Accrue();
		
		
		w.Swimming();
		w.fly();
		
		System.out.println();
		System.out.println();
		Animal a1=new Birds();
		a1.eat();
		a1.call();
		a1.fly();
		
	}
}
