package org.demo.entity;

public class CB_Bean {
	private int cid;
	private String cname;
	private int sid;
	private String sname;
	private int sage;
	private String ssex;
	private ClassBean Cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public ClassBean getCname1() {
		return Cname;
	}
	public void setCname(ClassBean cname) {
		Cname = cname;
	}
	
	
}
