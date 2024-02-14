package org.java.inheritanceEx;

// �׽�Ʈ�� Ŭ����
class A1 {
	int a;

	public A1() {
		super(); // �θ�Ŭ����(Object)�� ������(�⺻������)
		System.out.println("A1 �⺻ ������");
	}

	public A1(int a) {
		this(); // �ٸ� ������
//		this.a = 10; // ��� -> �ʵ�
//		this.m1(); // �޼ҵ�
		this.a = a;
	}

	// ������(polymorphism) -> �����ε�
	void m1() {
		System.out.println("A1 m1()");
	}
}

class B1 extends A1 {
	int b;

	public B1() {
		super(); // A1Ŭ���� �⺻ ������
	}

	void m2() {
		System.out.println("B1 m2()");
	}

	// ������(polymorphism)
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

		// ������(polymorphism)
		A1 a2 = new B1();
	}

}
