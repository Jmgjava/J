package org.java.dto;

public class MemberDto {

	private String userId;
	private String userPw;
	private int age;
	private String name;

	// 생성자, 기본, all
	// get,set
	// to String

	public MemberDto() {
		// TODO Auto-generated constructor stub
		// 기본 생성자
	}

	// 생성자
	public MemberDto(String userId, String userPw, int age, String name) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPw=" + userPw + ", age=" + age + ", name=" + name + "]";
	}

}
