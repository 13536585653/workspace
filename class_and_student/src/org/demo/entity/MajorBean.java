package org.demo.entity;

//Major ×¨Òµ£¬Ö÷ÐÞ
public class MajorBean {
	private int mid;
	private String mname;
	private String mIntroduce;   //introduce½éÉÜ
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getmIntroduce() {
		return mIntroduce;
	}
	public void setmIntroduce(String mIntroduce) {
		this.mIntroduce = mIntroduce;
	}
	@Override
	public String toString() {
		return "Major [mid=" + mid + ", mname=" + mname + ", mIntroduce=" + mIntroduce + "]";
	}
	
	
}
