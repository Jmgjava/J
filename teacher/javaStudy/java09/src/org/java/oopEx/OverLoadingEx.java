package org.java.oopEx;

public class OverLoadingEx {

	private String userId;
	private String userPw;
	private int age;
	private static String userId2;
	
	
	
	public static void m1() {	
		System.out.println(OverLoadingEx.userId2);
		//method1();
	}
	
	//매서드 오버로딩
	public void method1() {
		OverLoadingEx.m1();
		OverLoadingEx.userId2="11";
		System.out.println("method1");
	}
	//매개인자(변수)
	public void method1(String userId) {
		this.userId=userId;
		System.out.println(this.userId);
	}
	public void method1(int age) {
		this.age=age;
		System.out.println(this.age);
	}
	public void method1(String userId, int age) {
		this.userId=userId;
		this.age=age;
		System.out.println(this.userId+", "+this.age);
	}
	public void method1(int age,  String userId) {
		this.userId=userId;
		this.age=age;
		System.out.println(this.userId+", "+this.age);
	}
	// 오버로딩X
	// return X
//	public int method1() {
//		return 1;
//	}
	//매개인자 타입이 같으면 이름과 상관없이 X
//	public void method1(String id) {
//		this.userId=id;
//	}
//	public void method1(String id, int userAge) {		
//	}
	
	
}
