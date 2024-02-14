package org.java.inheritanceEx;

//테스트용
class A2 {
	int a;

	// 다형성(polymorphism)
	// 오버로딩 -> 매서드명이 똑같고 매개인자(변수) 타입또는 갯수가 다른 경우 허용
	public A2() {
		super();// Object클래스 기본생성자
		System.out.println("A2 기본생성자 ,자동");
	}

	public A2(int a) {
		this.a = a;
	}

	void m1() {
		System.out.println("A2 m1()");
	}
}

class B2 extends A2 {
	int b;

	public B2() {
		super();// A2클래스 기본생성자
		System.out.println("B2 기본생성자 ,자동");
	}

	void m2() {
		System.out.println("B2 m2()");
	}

	// 다형성(polymorphism)
	// 오버라이드 -> 상속을 통해서 부모 매서드의 선언부는 같고 구현부를 다르게 구현 방법
	@Override
	void m1() {
		System.out.println("부모 m1() ");
		;
	}
}

public class InheritanceEx3 extends B2 {

	int c;

	public InheritanceEx3() {
		super();// B2클래스 기본생성자
	}

	public static void main(String[] args) {

		// 다형성(polymorphism)
		// 부모타입의 객체 참조변수 로 다양한 객체에 접근 가능
		// 참조하는 값은 부모타입 맴버만 가능
		A2 a2 = new A2();
		a2.a = 10;
		a2.m1();

		a2 = new B2();
		a2.a = 10;
		a2.m1();

		a2 = new InheritanceEx3();
		a2.a = 10;
		a2.m1();

	}
}
