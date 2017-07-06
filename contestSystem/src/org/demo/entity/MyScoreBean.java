package org.demo.entity;

import java.sql.Timestamp;

public class MyScoreBean {
	private int scoreid;
	private ProjectBean project;
	private float ui;
	private float code;
	private float document;
	private float speech;
	private Timestamp sdate;
	
	
	
	public int getScoreid() {
		return scoreid;
	}



	public void setScoreid(int scoreid) {
		this.scoreid = scoreid;
	}



	public ProjectBean getProject() {
		return project;
	}



	public void setProject(ProjectBean project) {
		this.project = project;
	}



	public float getUi() {
		return ui;
	}



	public void setUi(float ui) {
		this.ui = ui;
	}



	public float getCode() {
		return code;
	}



	public void setCode(float code) {
		this.code = code;
	}



	public float getDocument() {
		return document;
	}



	public void setDocument(float document) {
		this.document = document;
	}



	public float getSpeech() {
		return speech;
	}



	public void setSpeech(float speech) {
		this.speech = speech;
	}



	public Timestamp getSdate() {
		return sdate;
	}



	public void setSdate(Timestamp sdate) {
		this.sdate = sdate;
	}



	@Override
	public String toString() {
		return "MyScoreBean [scoreid=" + scoreid + ", Projectid=" + project + ", ui=" + ui + ", code=" + code
				+ ", document=" + document + ", speech=" + speech + ", sdate=" + sdate + "]";
	}
}
