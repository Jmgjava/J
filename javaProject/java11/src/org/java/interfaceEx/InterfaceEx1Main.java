package org.java.interfaceEx;

public class InterfaceEx1Main {

	public static void main(String[] args) {

		// 2. ��ü�� �������� ����
//		new InterfaceEx1();

		InterfaceEx1Sub1 in1 = new InterfaceEx1Sub1();
		in1.ab1();
		in1.defaultmethod();
		in1.inter2();
		in1.inter2(1, "b");

		System.out.println();

		// �������̽��� ��ü�� ����X -> �ݵ�� ������ü�� ���ؼ� ����
		InterfaceEx1 in02 = new InterfaceEx1Sub1();
		in02.ab1();
		in02.defaultmethod();

		System.out.println();

		InterfaceEx2 in2 = new InterfaceEx1Sub1();
		in2.inter2();
		in2.inter2(10, "bb");
	}

}
