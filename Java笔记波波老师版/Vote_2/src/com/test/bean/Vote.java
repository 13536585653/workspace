package com.test.bean;

public class Vote {
	
	private int v_id;
	private String v_title;
	private String v_desp;
	private String v_type;
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getV_title() {
		return v_title;
	}
	public void setV_title(String v_title) {
		this.v_title = v_title;
	}
	public String getV_desp() {
		return v_desp;
	}
	public void setV_desp(String v_desp) {
		this.v_desp = v_desp;
	}
	public String getV_type() {
		return v_type;
	}
	public void setV_type(String v_type) {
		this.v_type = v_type;
	}
	public Vote(int v_id, String v_title, String v_desp, String v_type) {
		super();
		this.v_id = v_id;
		this.v_title = v_title;
		this.v_desp = v_desp;
		this.v_type = v_type;
	}
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vote [v_id=" + v_id + ", v_title=" + v_title + ", v_desp="
				+ v_desp + ", v_type=" + v_type + "]";
	}
	

}
