package org.demo.entity;

public class StudentBean {
	private int sid;
	private String sname;
	private Integer sage;
	private String ssex;
	private ClassBean Cname;
	private MajorBean Mname;
	
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
	public ClassBean getCname() {
		return Cname;
	}
	public void setCname(ClassBean cname) {
		Cname = cname;
	}
	public MajorBean getMname() {
		return Mname;
	}
	public void setMname(MajorBean mname) {
		Mname = mname;
	}
	
}
