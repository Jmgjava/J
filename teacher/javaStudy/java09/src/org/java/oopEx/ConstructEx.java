package org.java.oopEx;

public class ConstructEx {

	private String userId;
	private String userPw;
	private int age;

	public ConstructEx() {
		System.out.println("기본생성자");
	}
	public ConstructEx(String userId) {
		this.userId=userId;
		System.out.println("다른생성자1");
	}
	public ConstructEx(String userId,String userPw) {
		this.userId=userId;
		this.userPw=userPw;
		System.out.println("다른 생성자2");
	}	
	public ConstructEx(String userId,String userPw, int age) {
		this.userId=userId;
		this.userPw=userPw;
		this.age=age;
		System.out.println("다른 생성자3");
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
