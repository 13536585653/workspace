package com.test.bean;

import java.util.Date;

/*
 * ������
 * */
public class Bulletin_board {
	//Ϊ�����ඨ������
	private int bb_id;
	private String bb_title;
	private String bb_details;
	private Date bb_time;
	private String bb_author;
	
	//Ϊ�������дget��set����
	public int getBb_id() {
		return bb_id;
	}
	public void setBb_id(int bb_id) {
		this.bb_id = bb_id;
	}
	public String getBb_title() {
		return bb_title;
	}
	public void setBb_title(String bb_title) {
		this.bb_title = bb_title;
	}
	public String getBb_details() {
		return bb_details;
	}
	public void setBb_details(String bb_details) {
		this.bb_details = bb_details;
	}
	public Date getBb_time() {
		return bb_time;
	}
	public void setBb_time(Date bb_time) {
		this.bb_time = bb_time;
	}
	public String getBb_author() {
		return bb_author;
	}
	public void setBb_author(String bb_author) {
		this.bb_author = bb_author;
	}
	
	//Ϊ�������д���췽��
	public Bulletin_board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bulletin_board(int bb_id, String bb_title, String bb_details, Date bb_time, String bb_author) {
		super();
		this.bb_id = bb_id;
		this.bb_title = bb_title;
		this.bb_details = bb_details;
		this.bb_time = bb_time;
		this.bb_author = bb_author;
	}
	
	//Ϊ�������дtoString����
	@Override
	public String toString() {
		return "bulletin_board [bb_id=" + bb_id + ", bb_title=" + bb_title + ", bb_details=" + bb_details + ", bb_time="
				+ bb_time + ", bb_author=" + bb_author + "]";
	}
	
	
}