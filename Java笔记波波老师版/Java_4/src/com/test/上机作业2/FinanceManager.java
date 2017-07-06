package com.test.上机作业2;

public class FinanceManager extends Manager {

	public void calculateSalary(){
		
		System.out.println("财务经理的核算工资方法...");
	}
	
	//重写introduce()
	public void introduce(){
		System.out.println("财务经理的介绍方法");
	}
	
	//重写processs()
	public void processs(){
			System.out.println("财务经理的日常事务方法");
	}
	
}
