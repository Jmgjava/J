package org.java.oopEx;

public class ClassBasic4 {

	// 인스턴스 멤버
	public int num1;
	public int num2;
	private String userId; // setters, getters
	private String userPw; // setters, getters

	// 메소드 -> return문 -><- 반환타입 타입 일치 해야된다.
	// 메소드 유형1
	// void return값이 없다.생략 가능
	public void method1() {
		// 지역변수(local) -> 메소드가 종료되면 메모리에서 제거됨
		int m1 = 10;
		int m2 = 20;
		int s1 = m1 + m2;
		System.out.println("메소드(인스턴스)" + s1);
//		return;
	}

	// 메소드 유형2
	// void return값이 없다. 입력값이 있다.
	public void method2(int num1, int num2) {
		// 지역변수(local) -> 메소드가 종료되면 메모리에서 제거됨
		System.out.println(num1 + num2);
//		return
	}

	// 메소드 유형3
	// 반환타입 → 반드시 return값이 있어야된다.
	// 입력값이 없다.
	public int method3() {
		return 100;
	}

	public String method31() {
		return "반환문자열";
	}

	// 메소드 유형4
	// 반환타입 → 반드시 return값이 있어야된다.
	// 입력값이 있다.
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
