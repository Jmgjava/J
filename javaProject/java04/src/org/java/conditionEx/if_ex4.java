package org.java.conditionEx;

import java.util.Scanner;

public class if_ex4 {

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

		// if~else if~else
		// �����ڰ� +*-/ �̿��� ���� �Է��� �Ǹ�
		// "������ �Է� ����"�޼����� �ֿܼ� ���
		// �������� ���� ���� ����

		if (op.equals("+")) {
			System.out.println(one + two);
		} else if (op.equals("-")) {
			System.out.println(one - two);
		} else if (op.equals("*")) {
			System.out.println(one * two);
		} else if (op.equals("/")) {
			System.out.println((double) one / two);
		} else {
			System.out.println("������ �Է� ����");
		}

		esc.close();
	}

}