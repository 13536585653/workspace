package com.test.test;

import com.test.bean.Animal;
import com.test.bean.Cat;
import com.test.bean.Dog;

public class Test2 {
	
	public static void main(String[] args) {
		
		Animal animal=new Animal("小白");
		
		System.out.println(animal.XXXXX);
		
		System.out.println(Animal.z);  //通过类名直接访问类的静态属性
	      Animal.zzz();   //通过类名直接调用类的静态方法
		
		
		Dog dog=new Dog("小黑", "哈士奇");
		Cat cat=new Cat("小花", 2);
		
		System.out.println(animal);
        System.out.println(dog);
        System.out.println(cat);
		
		animal.eat();  //执行Animal类的eat方法 
		dog.eat();     //执行Dog类自己的eat方法
		cat.eat();     //执行Cat类自己的eat方法
		
		dog.run();   //执行Dog类独有的run方法
		cat.sleep();  //执行Cat类独有的sleep方法
		
		
		
	}

}
