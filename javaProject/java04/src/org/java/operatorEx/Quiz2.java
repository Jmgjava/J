package org.java.operatorEx;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		System.out.println("=== ���� ===");
		// �� ������ ������(+-*/)�� �Է¹޾Ƽ�
		// �����ڰ� +�� ���ϱ�, -�� ����, *�� ���ϱ�, /�� ������ ������ �����Ͻÿ�.

		Scanner esc = new Scanner(System.in);

		System.out.println("ù ��° ���� �Է�");
		int one = esc.nextInt();

		System.out.println("�� ��° ���� �Է�");
		int two = esc.nextInt();

		System.out.println("�����ڸ� �Է��ϼ���(+-*/)");
		String op = esc.next();

		// if��, equals ����Ͽ� ����

		// op�� + -> one+two ���� �ֿܼ� ���
		if (op.equals("+")) {
			System.out.println(one + two);
		}

		// op�� - -> one-two ���� �ֿܼ� ���
		if (op.equals("-")) {
			System.out.println(one - two);
		}

		// op�� * -> one*two ���� �ֿܼ� ���
		if (op.equals("*")) {
			System.out.println(one * two);
		}

		// op�� / -> one/two ���� �ֿܼ� ���
		if (op.equals("/")) {
			System.out.println((double) one / two);
		}

		esc.close();

	}
}
