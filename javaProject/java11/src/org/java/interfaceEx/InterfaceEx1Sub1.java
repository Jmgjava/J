package org.java.interfaceEx;

// 클래스 implements 인터페이스, 클래스 -> 인터페이스
public class InterfaceEx1Sub1 implements InterfaceEx1, InterfaceEx2 {

	@Override
	public void ab1() {

		System.out.println("추상메소드 구현");
	}

	@Override
	public void defaultmethod() {

		System.out.println("선택메소드 -> default");
	}

	@Override
	public void inter2() {
		System.out.println("추상메소드 inter2");

	}

	@Override
	public void inter2(int num1, String b) {
		System.out.println(num1 + (b));
	}

}
