package com.test.test;

import com.test.bean2.Boy;
import com.test.bean2.Person;

public class Test3 {
	
	public static void main(String[] args) {
		
		Person  p=new Person("张三", "男");
		Boy boy1=new Boy("李四", "男", 55.5);
		
		Person boy2=new Boy("王五","男",44.5);
		
		Boy boy3=(Boy)boy2;   //类型强转
		
		Boy  boy4=(Boy)p;  //把p强转成boy  会报错！
		
		p.eat();
		
		
		
		boy1.eat();
		boy1.play();
		
		//boy2.play();  错误！只能调用父类有的方法.
		boy2.eat();  //调用时，还是调用子类的重写方法。
		
		
		boy3.play();
		boy3.eat();
		
		boy4.eat();
		boy4.play();
		
		
	}

}
