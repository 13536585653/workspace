package com.test.bean2;

public class Boy  extends Person{

	//Boy�� �̳��� Person��
	
	//�Լ�������
	private  double  weight;
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return this.weight;
	}
	
	//����Ĺ��췽��
	public Boy(){
		super();    //���ø����޲ι��췽��
	};
	
	public Boy(String name,String sex,double weight){
		
		super(name, sex); //���ø����вι��췽��
		this.weight=weight;  
		
	};
	
	//boy�Լ���toString 
	public String toString(){
		return "Boy[name="+super.getName()+",sex="+super.getSex()+",weight="+this.weight+"]";
	}
	
	//��дeat()
	public void eat(){
		System.out.println("boy:���ڳԷ�....");
	}
	
	public void play(){
		
		System.out.println("boy:������ˣ....");
	}
	
	
	
}
