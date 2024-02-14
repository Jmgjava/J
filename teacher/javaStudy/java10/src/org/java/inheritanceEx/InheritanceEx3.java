package org.java.inheritanceEx;

//�׽�Ʈ��
class A2 {
	int a;

	// ������(polymorphism)
	// �����ε� -> �ż������ �Ȱ��� �Ű�����(����) Ÿ�ԶǴ� ������ �ٸ� ��� ���
	public A2() {
		super();// ObjectŬ���� �⺻������
		System.out.println("A2 �⺻������ ,�ڵ�");
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
		super();// A2Ŭ���� �⺻������
		System.out.println("B2 �⺻������ ,�ڵ�");
	}

	void m2() {
		System.out.println("B2 m2()");
	}

	// ������(polymorphism)
	// �������̵� -> ����� ���ؼ� �θ� �ż����� ����δ� ���� �����θ� �ٸ��� ���� ���
	@Override
	void m1() {
		System.out.println("�θ� m1() ");
		;
	}
}

public class InheritanceEx3 extends B2 {

	int c;

	public InheritanceEx3() {
		super();// B2Ŭ���� �⺻������
	}

	public static void main(String[] args) {

		// ������(polymorphism)
		// �θ�Ÿ���� ��ü �������� �� �پ��� ��ü�� ���� ����
		// �����ϴ� ���� �θ�Ÿ�� �ɹ��� ����
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
