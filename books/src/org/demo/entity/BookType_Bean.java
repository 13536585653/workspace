package org.demo.entity;

public class BookType_Bean {
	private int bt_id;
	private String bt_type;
	
	public int getBt_id() {
		return bt_id;
	}
	public void setBt_id(int bt_id) {
		this.bt_id = bt_id;
	}
	public String getBt_type() {
		return bt_type;
	}
	public void setBt_type(String bt_type) {
		this.bt_type = bt_type;
	}
	@Override
	public String toString() {
		return "BookType_Bean [bt_id=" + bt_id + ", bt_type=" + bt_type + "]";
	}
	
}
