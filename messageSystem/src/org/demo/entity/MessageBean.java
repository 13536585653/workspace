package org.demo.entity;

import java.sql.Date;

public class MessageBean {
	private int mid;
	private String mcontent;
	private Date publish;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public Date getPublish() {
		return publish;
	}
	public void setPublish(Date publish) {
		this.publish = publish;
	}
	@Override
	public String toString() {
		return "MessageBean [mid=" + mid + ", mcontent=" + mcontent + ", publish=" + publish + "]";
	}
	
}
