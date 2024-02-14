package org.java.oopEx;

public class ConstructEx {

	// ConstructEx클래스의 멤버
	// 필드
	private int num1;
	private int num2;

	// NoArgsConstruct
	public ConstructEx() {
		System.out.println("기본생성자");
	}

	public ConstructEx(int num1) {
		this.num1 = num1;
	}

	public ConstructEx(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}
}
