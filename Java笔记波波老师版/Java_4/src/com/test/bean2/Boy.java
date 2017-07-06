package com.test.bean2;

public class Boy  extends Person{

	//Boy类 继承于 Person类
	
	//自己的属性
	private  double  weight;
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return this.weight;
	}
	
	//子类的构造方法
	public Boy(){
		super();    //调用父类无参构造方法
	};
	
	public Boy(String name,String sex,double weight){
		
		super(name, sex); //调用父类有参构造方法
		this.weight=weight;  
		
	};
	
	//boy自己的toString 
	public String toString(){
		return "Boy[name="+super.getName()+",sex="+super.getSex()+",weight="+this.weight+"]";
	}
	
	//重写eat()
	public void eat(){
		System.out.println("boy:正在吃饭....");
	}
	
	public void play(){
		
		System.out.println("boy:正在玩耍....");
	}
	
	
	
}
