package com.test.groupB;

public class Dog {
	
	private String name;     //����
	private int  age;
	private String type;
	
	//name���Ե�set����
	public void setName(String name){
		this.name=name;
	}
	
	//name���Ե�get����
	public String getName(){
		
		return this.name;
	}
	
	//age�� get,set
	public void setAge(int age){
		
		if(age<0)
			this.age=0;
		else
		  this.age=age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	//type��get,set
	public void setType(String type){
		this.type=type;
	}
	
	public String getType(){
		return this.type;
	}
	          
	
	
	//���췽��
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
    
	
	
	//toString ����
	public String toString(){
		
		return "Dog[name="+this.name+",age="+this.age+",type="+this.type+"]";
	}
	
	
	
	
	

}
