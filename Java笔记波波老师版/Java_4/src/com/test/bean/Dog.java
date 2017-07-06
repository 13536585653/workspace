package com.test.bean;

public class Dog extends Animal {

	private String type;
	
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}
	
	public Dog(){
		super();
	}
	
	public Dog(String name,String type){
		super(name);
		this.type=type;
	}
	
	public String toString(){
		return "Dog[name="+super.getName()+",type="+this.type+"]";
	}
	
	public void run(){
		System.out.println("��:"+super.getName()+"����...");
	}
	
	//��д�����eat����
	public void eat(){
		System.out.println("��:"+super.getName()+"�ڿй�ͷ...");
	}
	
	
}
