package org.java.inheritanceEx;

//�׽�Ʈ��

class A2 {
	int a;

	// ������(polymorphism)
	// �����ε� -> �޼ҵ���� �Ȱ��� �Ű�����(����) Ÿ�� �Ǵ� ������ �ٸ� ��� ���
	public A2() {
		super(); // Object Ŭ���� �⺻ ������
		System.out.println("A2 �⺻������, �ڵ�");
	}

	public A2(int a) {
		this.a = a;
	}

	void m1() {
		System.out.println("A2 m1()");
	}
}

class B2 extends A2 {
	public B2() {
		super();// A2 Ŭ���� �⺻������
		System.out.println("B2�⺻ ������, �ڵ�");
	}

	void m2() {
		System.out.println("B2 m2()");
	}

	// ������(polymorphism)
	// �������̵� -> ����� ���ؼ� �θ� �޼ҵ��� ����δ� ������ �����θ� �ٸ��� �����ϴ� ���
	@Override
	void m1() {
		System.out.println("�θ� m1()");
	}
}

public class InheritanceEx4 extends B2 {
	int c;

	public InheritanceEx4() {
		super();// B2 Ŭ���� �⺻������
	}

	public static void main(String[] args) {

		// ������(polymorphism)
		// �θ�Ÿ���� ��ü ���������� �پ��� ��ü�� ���� ����
		A2 a2 = new A2();
		a2.a = 10;
		a2.m1();

		a2 = new B2();
		a2.a = 10;
		a2.m1();

		a2 = new InheritanceEx4();
		a2.a = 10;
		a2.m1();

	}

}