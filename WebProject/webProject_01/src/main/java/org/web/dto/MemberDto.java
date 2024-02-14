package org.web.dto;

public class MemberDto {

	private int no;
	private String userId;
	private String userPw;
	private String userName;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int no, String userId, String userPw, String userName) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}

	public MemberDto(String userId, String userPw, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "MemberDto [no=" + no + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + "]";
	}

}
