package org.java.interfaceEx;

public class InterfaceEx1Main {

	public static void main(String[] args) {

		// 2. ��ü�� ���� ���Ѵ�.
//		new InterfaceEx1();

		InterfaceEx1Sub1 in0 = new InterfaceEx1Sub1();
		in0.ab1();
		in0.defaultMethod();
		in0.inter2();
		in0.inter2(100, 200);

		System.out.println();
		// �������̽��� ��ü�� ���� X -> �ݵ�� ������ü�� ���ؼ� ����
		InterfaceEx1 in1 = new InterfaceEx1Sub1();
		in1.ab1();
		in1.defaultMethod();

		System.out.println();

		InterfaceEx2 in2 = new InterfaceEx1Sub1();
		in2.inter2();
		in2.inter2(200, 300);

	}
}
