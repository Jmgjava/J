package org.java.conditionEx;

import java.util.Scanner;

public class SwichEx2 {

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

		switch (op) {
		case ("+"):
			System.out.println(one+"+"+two+"="+(one + two));
			break;
		case ("-"):
			System.out.println(one+"-"+two+"="+(one - two));
			break;
		case ("*"):
			System.out.println(one+"*"+two+"="+(one * two));
			break;
		case ("/"):
			System.out.println(one+"/"+two+"="+((double)one / two));
			break;
		default:
			System.out.println("+,-,*,/ �� �ϳ��� �Է��Ͻÿ�.");
		}

	}
}
