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
	
	//�ż��� �����ε�
	public void method1() {
		OverLoadingEx.m1();
		OverLoadingEx.userId2="11";
		System.out.println("method1");
	}
	//�Ű�����(����)
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
	// �����ε�X
	// return X
//	public int method1() {
//		return 1;
//	}
	//�Ű����� Ÿ���� ������ �̸��� ������� X
//	public void method1(String id) {
//		this.userId=id;
//	}
//	public void method1(String id, int userAge) {		
//	}
	
	
}
