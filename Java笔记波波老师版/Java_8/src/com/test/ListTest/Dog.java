package com.test.ListTest;

public class Dog {
	
	private String name;
	private String type;
	
	public void setName(String name){
		 this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}
	
	public Dog(){
		
	}
	public Dog(String name,String type){
		this.name=name;
		this.type=type;
	}

	public String toString(){
		return "Dog[name="+this.name+",type="+this.type+"]";
	}
	
	
}
