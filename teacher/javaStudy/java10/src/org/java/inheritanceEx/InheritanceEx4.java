package org.java.inheritanceEx;

//�׽�Ʈ�� Ŭ����
class A1 {
	int a;

	// ������(polymorphism)-> �����θ�
	public A1() {
		super();// �θ�Ŭ����(Object)�� ������(�⺻������)
		System.out.println("A1�⺻������");
	}

	public A1(int a) {
//		this();//�ٸ� ������
//		this.a=10;//�ɹ� -> �ʵ�
//		this.m1();//�ɹ� ->  �ż���
		this.a = a;
	}

	void m1() {
		System.out.println("A1 m1()");
	}
}

class B1 extends A1 {
	int b;

	public B1() {
		super();// �θ�Ŭ���� -> A1Ŭ���� �⺻������
	}

	void m2() {
		System.out.println("B1 m2()");
	}

	// ������(polymorphism)
	@Override
	void m1() {
		System.out.println("m1() �ż���, �������̵�");
	}
}

public class InheritanceEx4 {

	public static void main(String[] args) {

		A1 a1 = new A1(10);
		B1 b1 = new B1();
		// ������(polymorphism)
		A1 a2 = new B1();

	}

}
