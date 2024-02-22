package org.web.dto;

public class MemberDto {

	private String userId;
	private String userPw;
	private String phone;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String userId, String userPw, String phone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPw=" + userPw + ", phone=" + phone + "]";
	}
	
	
}
