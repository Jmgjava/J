package org.java.oopEx;

public class ClassBasic5 {

	// 멤버

	// 접근 제한자
	private String userId; // 인스턴스 멤버 -> new 생성
	private String userPw; // 인스턴스 멤버 -> new 생성
	public int age; // 인스턴스 멤버 -> new 생성
	public static String projectName; // 클래스(static)멤버

	// 생성자 -> constructor -> 메소드
	// 반환타입 void -> 생략
	// 객체 생성시, 객체 유형을 선택
//	public ClassBasic5() {
//		System.out.println("기본생성자");
//	}

	// 메소드
	public void instanceMethod1() {
		this.userId = "m111";
		this.userPw = "1111";
		this.age = 14;
		// 인스턴스 메소드에서 클래스멤버를 사용 시 클래스, 멤버로 사용 권장
		ClassBasic5.projectName = "WE";
		System.out.println("인스턴스 메소드"); // 인스턴스 멤버 -> new 생성

		classMethod();
	}

	public static void classMethod() {
		// static 메소드에서는 static 필드만 사용가능
//		userId=100;
		ClassBasic5.projectName = "WEB";
		System.out.println("클래스 메소드"); // 클래스(static)멤버
		// static 메소드에서는 static 메소드만 사용가능
//		instanceMethod();
	}

	public void m1(String[] args) {
		System.out.println("");
	}

	// setter, getter -> private 필드에 외부 접근 허용
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

}
