package com.test.�ϻ���ҵ1;

public class Account {
	
	private float amount;   //���
	
	//���췽��
	public Account(){
		this.amount=10.0f;
	}
	
	public Account(int money){
		this.amount=(float)money;
	}
	
	//����
	public void income(float money){
		this.amount+=money;
		System.out.println("�ִ���:"+money);
	}
	
	//ȡ��� 
	public void takeot(float money){
	
		if(money>this.amount-1){
			
			System.out.println("�Բ���������㣡");	
		
		}else{
			
			this.amount-=money;
			System.out.println("��ȡ��:"+money);
		}
	}
	
	//��ʾ����:
	public void show(){
		System.out.println("��������:"+this.amount);
	}
	
	

}
