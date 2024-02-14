package org.java.innerclassEx;

class A {
	void m1() {
		System.out.println("m1");
	}
}

//class B extends A{} // B������ü
abstract class Ab1 {
	void m1() {
		System.out.println("m1");
	}

	abstract void m2();
}

interface In4 {
	abstract void m3();
}

public class AnnoymouseEx2 {

	public static void main(String[] args) {
		// �Ϲ�Ŭ���� new �θ�Ŭ����(){ // �������̵�}
		new A() {
			@Override
			void m1() {
				System.out.println("�͸�Ŭ������ ����� �������̵�");
			}
		}.m1();

		// �߻�Ŭ���� new �߻�Ŭ����(){ // �������̵�}
		new Ab1() {
			@Override
			void m2() {
				System.out.println("�߻�Ŭ��������(�͸�Ŭ����)");
			}
		}.m2();

		new In4() {

			@Override
			public void m3() {
				System.out.println("�������̽�����(�͸�Ŭ����)");
			}
		}.m3();

	}
}
