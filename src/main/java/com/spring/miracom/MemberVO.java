package com.spring.miracom;

public class MemberVO {
	String id;
	String pwd;
	String name;
	String gender;
	String hobby;
	
	public MemberVO() {
		
	}
	public MemberVO(String id, String pwd, String name, String gender, String hobby) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
