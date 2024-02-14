package org.java.oopEx;

public class ConstructEx2 {

	private String userId;
	private String userPw;

	// 기본생성
	public ConstructEx2() {
		this("m111", "1111"); // 다른 생성자 호출
		System.out.println("기본 생성자");
	}

	public ConstructEx2(String userId) {
		// this.멤버(필드, 메소드)
		this.userId = userId;
	}

	public ConstructEx2(String userId, String userPw) {
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
		return "ConstructEx2 [userId=" + userId + ", userPw=" + userPw + "]";
	}

}
