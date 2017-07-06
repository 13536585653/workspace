package com.test.上机作业2;

public class SaleManager extends Manager {

	public void analyseSale(){
		System.out.println("销售经理的销售分析方法....");
	}
	
	   //重写introduce()
		public void introduce(){
			System.out.println("销售经理的介绍方法");
		}
		
		//重写processs()
		public void processs(){
				System.out.println("销售经理的日常事务方法");
		}
}
