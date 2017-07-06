package com.test.bean;

public class CartItem {
   
	 //购物项类
	private Product p;   //购买商品
	private int num;      //购买的数量 
	private double sum;
	
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public CartItem(Product p, int num) {
		super();
		this.p = p;
		this.num = num;
		
	}
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CartItem [p=" + p + ", num=" + num + ", sum=" + sum + "]";
	}
	
	public void setSum() {
		
		this.sum=this.p.getProPrice()*this.num;
		
	}
	
	
}
