package org.java.inheritanceEx;

// 테스트용 클래스
class A1 {
	int a;

	public A1() {
		super(); // 부모클래스(Object)의 생성자(기본생성자)
		System.out.println("A1 기본 생성자");
	}

	public A1(int a) {
		this(); // 다른 생성자
//		this.a = 10; // 멤버 -> 필드
//		this.m1(); // 메소드
		this.a = a;
	}

	// 다형성(polymorphism) -> 오버로딩
	void m1() {
		System.out.println("A1 m1()");
	}
}

class B1 extends A1 {
	int b;

	public B1() {
		super(); // A1클래스 기본 생성자
	}

	void m2() {
		System.out.println("B1 m2()");
	}

	// 다형성(polymorphism)
	@Override
	void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}

}

public class InheritanceEx3 {

	public static void main(String[] args) {

		A1 a1 = new A1();
		B1 b1 = new B1();

		// 다형성(polymorphism)
		A1 a2 = new B1();
	}

}
