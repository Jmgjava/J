package org.java.dto;

public class MemberDto {

	private String userId;
	private String userPW;
	private int age;
	private String name;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String userId, String userPW, int age, String name) {
		super();
		this.userId = userId;
		this.userPW = userPW;
		this.age = age;
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
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
		return "MemberDto [userId=" + userId + ", userPW=" + userPW + ", age=" + age + ", name=" + name + "]";
	}
}
