package org.demo.object;

public class Test {
	public static void main(String args[]){
		Bean b1=new Bean();
		b1.setNumA(1);
		b1.setNumB(3);

		//�����ӷ�������
		Add add=new Add();
		b1=add.calculator(b1);
		add.display(b1);
		
		//��������������
		Sub sub=new Sub();
		Bean b=sub.calculator(b1);
		sub.display(b);
		
		//�����˷�������
		Multi multi=new Multi();
		Bean b3=multi.calculator(b1);
		multi.display(b3);
		
		//��������������
		Div div=new Div();
		Bean b4=div.calculator(b1);
		div.display(b4);
	}
}
