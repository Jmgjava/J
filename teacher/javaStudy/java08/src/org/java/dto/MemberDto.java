package org.java.dto;

import java.util.Date;

public class MemberDto {

	private int no;
	private String userId;
	private String userPw;
	private String name;
	private String email;
	private String phone;// 010
	private Date date;

	public void setNo(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		String info = "";
		info += "ȸ����ȣ: " + this.getNo();
		info += ", ȸ��ID: " + this.getUserId();
		info += ", ȸ��PW: " + this.getUserPw();
		info += ", ȸ���̸�: " + this.getName();
		info += ", ȸ���̸���: " + this.getEmail();
		info += ", ȸ����ȭ: " + this.getPhone();
		info += "ȸ������: " + this.getDate();
		return info;
	}

}
