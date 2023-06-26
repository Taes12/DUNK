package com.springproject.dunk.hy.domain;

public class User {

	private String id;
	private String pass;
	private int grade;
	private String name;
	private String nickname;
	private String mobile;
	private String email;
	private String zipcode;
	private String address1;
	private String address2;	
	private int matchNum;
	private int assessNum;
	private int point;
	private int isProfile;
	private int profileImg;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getMatchNum() {
		return matchNum;
	}
	public void setMatchNum(int matchNum) {
		this.matchNum = matchNum;
	}
	public int getAssessNum() {
		return assessNum;
	}
	public void setAssessNum(int assessNum) {
		this.assessNum = assessNum;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getIsProfile() {
		return isProfile;
	}
	public void setIsProfile(int isProfile) {
		this.isProfile = isProfile;
	}
	public int getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(int profileImg) {
		this.profileImg = profileImg;
	}	
}
