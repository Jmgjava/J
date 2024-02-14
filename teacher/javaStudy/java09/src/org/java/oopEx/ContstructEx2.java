package org.java.oopEx;

public class ContstructEx2 {

	private String userId;
	private String userPw;

	// 기본생성자
	public ContstructEx2() {
		this("m111", "1111"); // 다른생성자 호출
		System.out.println("기본생성자");
	}

	public ContstructEx2(String userId) {
		this();
		// this.맴버(필드,매서드)
		this.userId = userId;
	}

	public ContstructEx2(String userId, String userPw) {
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
		return "ContstructEx2 [userId=" + userId + ", userPw=" + userPw + "]";
	}

}
