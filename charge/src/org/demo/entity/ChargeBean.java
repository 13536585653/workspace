package org.demo.entity;

public class ChargeBean {
	//商品单价
	private double price;
	//购买数量
	private int num;
	//折扣率
	private double retabe;
	//返利
	private double rebate;
	private double returnMoney;
	//实收
	private double result;
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getRetabe() {
		return retabe;
	}
	public void setRetabe(double retabe) {
		this.retabe = retabe;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	public double getReturnMoney() {
		return returnMoney;
	}
	public void setReturnMoney(double returnMoney) {
		this.returnMoney = returnMoney;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
}
