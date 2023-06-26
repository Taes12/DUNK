package com.springproject.dunk.hy.domain;

import java.sql.Timestamp;
import java.util.List;

public class Event {

	private int no;
	private String title;
	private Timestamp regDate;
	private String Content;
	private int readCount;
	private int recommend;	
	private List<String> imgFileNames;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public List<String> getImgFileNames() {
		return imgFileNames;
	}
	public void setImgFileNames(List<String> imgFileNames) {
		this.imgFileNames = imgFileNames;
	}
	
}
