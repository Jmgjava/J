package org.java.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

public class MemberDto {

	private int no;
	private String userId;
	private String userPw;
	private String Name;
	private String Email;
	private String phone; // 010
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
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEmail() {
		return Email;
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
		System.out.println("회원no: " + this.getNo());
		System.out.println("회원Id: " + this.getUserId());
		System.out.println("회원Pw: " + this.getUserPw());
		System.out.println("회원Na: " + this.getName());
		System.out.println("회원Em: " + this.getEmail());
		System.out.println("회원ph: " + this.getPhone());
		System.out.println("회원Da: " + this.getDate());

		return info;
	}

}
