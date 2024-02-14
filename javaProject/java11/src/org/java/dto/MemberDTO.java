package org.java.dto;

public class MemberDTO {

	private String userId;
	private String userPw;
	private int age;

	// 다형성
	// 오버로딩 -> 생성자 오버로딩
	public MemberDTO() {
		System.out.println("기본 생성자");
	}

	public MemberDTO(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = 1;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
