package org.java.oopEx;

public class ConstructEx {

	private String userId;
	private String userPw;
	private int age;

	public ConstructEx() {
		System.out.println("기본");
	}

	public ConstructEx(String userId) {
		this.userId = userId;
		System.out.println("다른");
	}

	public ConstructEx(String userPw, String userId) {
		this.userPw = userPw;
		this.userId = userId;
		System.out.println("다른2");
	}

	public ConstructEx(String userPw, String userId, int age) {
		this.userPw = userPw;
		this.userId = userId;
		this.age = age;
		System.out.println("다른2");
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
