package org.java.oopEx;

public class Calculator2 {

	// �ʵ�X
	// �ż���0

	public void opMethod(int num1, int num2, String op) {

		System.out.println(op + "���� ����");

		if (op.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (op.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (op.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (op.equals("/")) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		} else {
			System.out.println("������ �Է¿���");
		}

	}
}
