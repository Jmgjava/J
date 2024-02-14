package org.java.innerclassEx;

class A {
	void m1() {
		System.out.println("m1");
	}
}
// class B extends A {} // B구현객체

abstract class Ab1 {
	abstract void m2();
}

interface In4 {
	abstract void m3();

}

public class AnonymousEx2 {

	public static void main(String[] args) {
		// 클래스 new 부모클래스() { // 오버라이딩 }
		new A() {
			@Override
			void m1() {
				System.out.println("익명클래스로 상속 후 구현");
			}
		}.m1();

		// 추상 클래스 new 추상클래스() { //오버라이딩 }}
		new Ab1() {

			@Override
			void m2() {
				System.out.println("추상클래스 구현(익명클래스)");

			}
		}.m2();

		new In4() {
			// 인터페이스
			@Override
			public void m3() {
				System.out.println("인터페이스 구현(익명클래스)");

			}
		}.m3();

	}
}
