package com.test.上机作业1;

public class Account {
	
	private float amount;   //余额
	
	//构造方法
	public Account(){
		this.amount=10.0f;
	}
	
	public Account(int money){
		this.amount=(float)money;
	}
	
	//存款方法
	public void income(float money){
		this.amount+=money;
		System.out.println("现存入:"+money);
	}
	
	//取款方法 
	public void takeot(float money){
	
		if(money>this.amount-1){
			
			System.out.println("对不起，你的余额不足！");	
		
		}else{
			
			this.amount-=money;
			System.out.println("现取出:"+money);
		}
	}
	
	//显示余额方法:
	public void show(){
		System.out.println("你的余额是:"+this.amount);
	}
	
	

}
