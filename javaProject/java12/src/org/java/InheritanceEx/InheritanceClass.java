package org.java.InheritanceEx;

//	class A extends Object {
class A {

	public A() {
		super(); // Object
	}

	int a;

	void m1() {
		System.out.println("m1");
	}
}

class B extends A {
	int b;

	void m2() {
		System.out.println("m2");
	}

	@Override
	void m1() {
		System.out.println("m1 -> 오버라이드 A (B)");
	}
}

class C extends B {
	int c;

	void m3() {
		System.out.println("m3");
	}

	@Override
	void m1() {
		System.out.println("m1 -> 오버라이드 B (C)");
	}

	@Override
	void m2() {
		System.out.println("m2 -> 오버라이드 B (C)");
	}

}

public class InheritanceClass {

	public static void main(String[] args) {
		A a = new C();
		a.a = 1;
		a.m1();

		a = new B();
		a.a = 10;
		a.m1();

		a = new A();
		a.a = 10;
		a.m1();
		

	}

}
