package org.java.oopEx;

public class OverLoadingEx {

	private String userId;
	private String userPw;
	private int age;

	// 메소드 오버로딩
	public void method1() {
		System.out.println("method1");
	}

	// 매개인자(변수)
	public void method1(String userId) {
		this.userId = userId;
		System.out.println(this.userId);
	}

	public void method1(int age) {
		this.age = age;
	}

	public void method1(String userId, int age) {
		this.userId = "m111";
		this.age = 11;
	}

	public void method1(int age, String userid) {
		this.userId = "n111";
		this.age = 15;
	}

	public void method1(String userId, String userPw, int age) {

		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
		System.out.println(this.userId + this.userPw + this.age);
	}

	// 오버로딩 X
	// return X
//	public void method1() {
//		return 0;
//	}

	// 매개인자 타입ㅇ 같으면 이름과 상관없이 X
//	public void method1(String userid) {
//		this.userId = userId;
//	}
//
//	public void method1(String userId, int age) {
//		this.userId = userId;
//		this.age = age;
//	}

}
