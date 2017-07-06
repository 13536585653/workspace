package org.demo.entity;

public class ProjectBean {
	private int projectid;
	private String projectname;
	private String remark;
	
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "ProjectBean [projectid=" + projectid + ", projectname=" + projectname + ", remark=" + remark + "]";
	}
	
}
