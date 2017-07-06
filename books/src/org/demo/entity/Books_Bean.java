package org.demo.entity;

public class Books_Bean {
	private int b_id;
	private String b_name;
	private String b_date;
	/**
	 * 关联的类型（has a），这是对象的关联
	 */
	private BookType_Bean type;
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	
	
	public BookType_Bean getType() {
		return type;
	}
	public void setType(BookType_Bean type) {
		this.type = type;
	}
	
}
