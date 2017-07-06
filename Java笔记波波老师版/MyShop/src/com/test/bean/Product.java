package com.test.bean;

public class Product {

	  /*
	   * …Ã∆∑¿‡
	   * 
	   */
	private String proId;
	private String proName;
	private String proDesc;
	private double proPrice;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(String proId, String proName, String proDesc, double proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proPrice = proPrice;
	}



	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}



	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName
				+ ", proDesc=" + proDesc + ", proPrice=" + proPrice + "]";
	}
	
	
	
	
	
}
