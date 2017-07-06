package org.demo.entity;

import java.sql.Date;

public class NewsBean{
	private int nid;
	private String ntitle;
	private String nauthor;
	private String ntype;
	private String  ncontent;
	private String narea;
	private Date ntime;
	
	
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public String getNtype() {
		return ntype;
	}
	public void setNtype(String ntype) {
		this.ntype = ntype;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getNarea() {
		return narea;
	}
	public void setNarea(String narea) {
		this.narea = narea;
	}
	public Date getNtime() {
		return ntime;
	}
	public void setNtime(Date ntime) {
		this.ntime = ntime;
	}
	@Override
	public String toString() {
		return "NewsBean [nid=" + nid + ", ntitle=" + ntitle + ", nauthor=" + nauthor + ", ntype=" + ntype
				+ ", ncontent=" + ncontent + ", narea=" + narea + ", ntime=" + ntime + "]";
	}
	
	
}
