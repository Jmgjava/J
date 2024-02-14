package org.java.interfaceEx;

public interface InterfaceEx1 {

	// 인터페이스 멤버 -> static 멤버, 추상메소드, default 메소드

//	int num1; // 일반 멤버 X
	public static final int NUM1 = 100; // static 멤버
	int NUM2 = 100;

	public abstract void ab1(); // 추상 메소드

	public static void staticMethod() {
		System.out.println("static 메소드");
	}

	// 상속에 결정 0
	default void defaultmethod() {
		System.out.println("default 메소드");
	}

//	public void m1() {//일반 멤버 X
//		System.out.println("일반 메소드");
//	}

}
