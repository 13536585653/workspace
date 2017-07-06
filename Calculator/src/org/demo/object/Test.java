package org.demo.object;

public class Test {
	public static void main(String args[]){
		Bean b1=new Bean();
		b1.setNumA(1);
		b1.setNumB(3);

		//创建加法计算器
		Add add=new Add();
		b1=add.calculator(b1);
		add.display(b1);
		
		//创建减法计算器
		Sub sub=new Sub();
		Bean b=sub.calculator(b1);
		sub.display(b);
		
		//创建乘法计算器
		Multi multi=new Multi();
		Bean b3=multi.calculator(b1);
		multi.display(b3);
		
		//创建除法计算器
		Div div=new Div();
		Bean b4=div.calculator(b1);
		div.display(b4);
	}
}
