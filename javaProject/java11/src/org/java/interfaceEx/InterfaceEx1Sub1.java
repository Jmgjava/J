package org.java.interfaceEx;

// Ŭ���� implements �������̽�, Ŭ���� -> �������̽�
public class InterfaceEx1Sub1 implements InterfaceEx1, InterfaceEx2 {

	@Override
	public void ab1() {

		System.out.println("�߻�޼ҵ� ����");
	}

	@Override
	public void defaultmethod() {

		System.out.println("���ø޼ҵ� -> default");
	}

	@Override
	public void inter2() {
		System.out.println("�߻�޼ҵ� inter2");

	}

	@Override
	public void inter2(int num1, String b) {
		System.out.println(num1 + (b));
	}

}
