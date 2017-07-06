package com.test.groupB;

public class Dog {
	
	private String name;     //属性
	private int  age;
	private String type;
	
	//name属性的set方法
	public void setName(String name){
		this.name=name;
	}
	
	//name属性的get方法
	public String getName(){
		
		return this.name;
	}
	
	//age的 get,set
	public void setAge(int age){
		
		if(age<0)
			this.age=0;
		else
		  this.age=age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	//type的get,set
	public void setType(String type){
		this.type=type;
	}
	
	public String getType(){
		return this.type;
	}
	          
	
	
	//构造方法
    public  Dog(String name){
		
		this.name=name;
		
	}
	
	public  Dog(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	
    public   Dog(String name,int age,String type){
		
		this.name=name;
		this.age=age;
		this.type=type;
	}
	
	public Dog(){
		
		
	}
    
	
	
	//toString 方法
	public String toString(){
		
		return "Dog[name="+this.name+",age="+this.age+",type="+this.type+"]";
	}
	
	
	
	
	

}
