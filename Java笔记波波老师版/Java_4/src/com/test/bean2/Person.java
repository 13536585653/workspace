package com.test.bean2;

public class Person {
	
	//Person类
	
	private String  name;
	private String  sex;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
    public void setSex(String sex){
    	this.sex=sex;
    }
	public String getSex(){
		return this.sex;
	}
    
	//构造方法
	public Person(){
		
		 
	}
	
	
	public Person(String name, String sex){
		
		this.name=name;
		this.sex=sex;
	}
	
	//toString方法
	public String toString(){
		return "Person[name="+name+",sex="+sex+"]";
	}
	
	public void eat(){
		
		System.out.println("人:"+this.name+"在吃饭");
	}
	
	
}
