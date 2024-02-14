package org.java.inheritanceEx;

class A extends Object {
	int a;

	public A() {
		super();// Object
	}

	public A(int a) {
		this.a = a;
	}

	void m1() {
		System.out.println("m1");
	}
}

class B extends A {
	int b;

	public B() {
		super();
	}

	void m2() {
		System.out.println("m2");
	}
//	@Override
//	void m1() {
//		System.out.println("m1-> �������̵� A");
//	}
}

class C extends B {
	int c;

	public C() {
		super();
	}

	void m3() {
		System.out.println("m3");
	}

	@Override
	void m1() {
		System.out.println("m1-> �������̵� B");
	}

	@Override
	void m2() {
		System.out.println("m2-> �������̵� B");
	}
}

public class InheritanceClass {

	public static void main(String[] args) {

		// ������
		// �����ε�, �������̵�
		// �ϳ��� �θ�Ÿ�� �������� ������ü�� ����� �� �ִ�.
		A a = new C();
		a.a = 10;
		a.m1();

		a = new B();
		a.a = 10;
		a.m1();

		a = new A();
		a.a = 20;
		a.m1();

		C c = new C();
		c.a = 10;
		c.m1();

	}
}
