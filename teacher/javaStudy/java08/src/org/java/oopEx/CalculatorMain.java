package org.java.oopEx;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator1 cal1 = new Calculator1();
		// �ʵ� -> �ʱ�ȭ
		// �ż��� -> �ʵ� ���
		cal1.num1 = 10;
		cal1.num2 = 100;

//		Scanner scn = new Scanner(System.in);
//		System.out.println("������ �Է� : ");
//
//		cal1.op = scn.next();// ������ �Է� +-*/
//
//		// if���̿��ؼ� cal1.op ->
//		if (cal1.op.equals("+")) {
//			// +
//			cal1.sum();// 10+100
//		} else if (cal1.op.equals("-")) {
//			// -
//			cal1.sub();
//		} else if (cal1.op.equals("*")) {
//			// *
//			cal1.mult();
//			;
//		} else if (cal1.op.equals("/")) {
//			// /
//			cal1.div();
//		} else {
//			System.out.println("������ �Է� ����");
//		}

		System.out.println();

		Calculator1 cal2 = new Calculator1();
		cal2.num1 = 44;
		cal2.num2 = 55;
		cal2.op = "+";
		cal2.opMethod();

//		cal2.sum();
//		cal2.sub();
//		cal2.mult();
//		cal2.div();

		System.out.println();

		Calculator2 c2 = new Calculator2();

		Scanner scn = new Scanner(System.in);
		System.out.println("����1");
		int m1 = scn.nextInt();

		System.out.println("����2");
		int m2 = scn.nextInt();

		System.out.println("������");
		String op2 = scn.next();

		c2.opMethod(m1, m2, op2);

//		cal1.sum();

	}
}