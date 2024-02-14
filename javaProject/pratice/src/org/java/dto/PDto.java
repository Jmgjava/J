package org.java.dto;

public class PDto {

	private int no;
	private String userId;
	private String userPw;
	private int age;
	private String name;

	public PDto() {
		System.out.println("기본 생성자");
	}

	public PDto(int no, String userId, String userPw, int age, String name) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
		this.name = name;
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
		return "PDto [no=" + no + ", userId=" + userId + ", userPw=" + userPw + ", age=" + age + ", name=" + name + "]";
	}

}
