package org.java.InheritanceEx;

abstract class Ab1 {
	int a;

	// �߻�޼ҵ� (�̿ϼ�) -> �ݵ�� �������̵� ����
	abstract void ab();

	void m1() {
		System.out.println("m1 �Ϲݸ޼ҵ�");
	}
}

class Ab1Sub1 extends Ab1 {
	@Override
	void ab() {
		System.out.println("�θ� ���� �޼ҵ� m1");
	}

	@Override
	void m1() {
		System.out.println("�߻�޼ҵ� �ݵ�� ����");
	}
}

public class InheritanceAbstract {

	public static void main(String[] args) {

//		new Ab1();

		Ab1 ab1 = new Ab1Sub1();
		ab1.a = 10;
		ab1.ab();
		ab1.m1();

	}
}
