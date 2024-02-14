package org.java.inheritanceEx;

// �׽�Ʈ��
// class A extends Object {} �� ���� (Object ����)
class A {
	int a;
	final int num1 = 10;

	public void m1() {
		System.out.println("AŬ���� m1()");
	}

	// �������̵��� �� �� ����.
	public final void m11() {
		System.out.println("final�޼ҵ� m11");
	}
}

class B extends A {
	int b;

	@Override
	public void m1() {
		System.out.println("BŬ���� m1()�������̵�");
	}

	public void m2() {
		System.out.println("BŬ���� m2()");
	}

}

class C extends B {
	int c;

	@Override
	public void m1() {
		System.out.println("CŬ���� m1()�������̵�");
	}

	@Override
	public void m2() {
		super.m2(); // super(�θ�Ŭ����).m2()
		System.out.println("CŬ���� m2()�������̵�");
	}

	public void m3() {
		System.out.println("CŬ���� m3()");
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

		// �θ�Ÿ���� ��ü ���� ������ �ڽİ�ü ���� �� �� �ִ�.

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
