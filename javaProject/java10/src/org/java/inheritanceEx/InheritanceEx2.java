package org.java.inheritanceEx;

// 테스트용
// class A extends Object {} 와 같음 (Object 생략)
class A {
	int a;
	final int num1 = 10;

	public void m1() {
		System.out.println("A클래스 m1()");
	}

	// 오버라이딩을 할 수 없다.
	public final void m11() {
		System.out.println("final메소드 m11");
	}
}

class B extends A {
	int b;

	@Override
	public void m1() {
		System.out.println("B클래스 m1()오버라이딩");
	}

	public void m2() {
		System.out.println("B클래스 m2()");
	}

}

class C extends B {
	int c;

	@Override
	public void m1() {
		System.out.println("C클래스 m1()오버라이딩");
	}

	@Override
	public void m2() {
		super.m2(); // super(부모클래스).m2()
		System.out.println("C클래스 m2()오버라이딩");
	}

	public void m3() {
		System.out.println("C클래스 m3()");
	}
	
//	@Override
//	private void m11()

	
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.a = 10;
		a1.m1();
		System.out.println(a1.num1);
		System.out.println();

		B b1 = new B();
		b1.a = 10;
		b1.b = 20;
		System.out.println(b1.num1);
		b1.m1();
		b1.m2();
		System.out.println();

		C c1 = new C();
		c1.a = 10;
		c1.b = 20;
		c1.c = 30;
		c1.m1();
		c1.m2();
		c1.m3();

		System.out.println("==============================");

		// 부모타입의 객체 참조 변수로 자식객체 접근 할 수 있다.

		A a0 = new A();
		a0.a = 10;
		a0.m1();

		A a01 = new B();
		a01.a = 10;
		a01.m1();

		A a2 = new C();
		a2.a = 10;
		a2.m1();

	}
}
