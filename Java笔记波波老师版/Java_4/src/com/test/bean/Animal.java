package com.test.bean;

public class Animal {

	private String name;
	
	public  final String XXXXX="aaa";   //常量
	
	public static String z="zzz";     //静态属性
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public Animal(){
		 
	}
	
	public Animal(String name){
		this.name=name;
	}
	
	public String toString(){
		return "Animal[name="+this.name+"]";
	}
	
	public void eat(){
		
		System.out.println(this.name+"在吃东西...");
	}
	
	public final  void  ccc(){
		
		System.out.println("父类的ccc方法....");
		
	}
	
	public static void zzz(){
		
		System.out.println("静态方法zzz。。。。");
	}
	
    
	
}
