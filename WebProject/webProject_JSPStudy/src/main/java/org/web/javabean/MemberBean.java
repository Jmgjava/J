package org.web.javabean;

public class MemberBean {

	private String userId;
	private String userPw;

	public MemberBean() {
		// TODO Auto-generated constructor stub
	}

	public MemberBean(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
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

	@Override
	public String toString() {
		return "MemberBean [userId=" + userId + ", userPw=" + userPw + "]";
	}

}
