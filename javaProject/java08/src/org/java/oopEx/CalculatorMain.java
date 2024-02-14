package org.java.oopEx;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

//		Calculator1 cal1 = new Calculator1();
//		// 필드 -> 초기화
//		// 메소드 -> 필드 사용
//		cal1.num1 = 10;
//		cal1.num2 = 20;
//
//		Scanner scn = new Scanner(System.in);
//		System.out.println("연산자 입력: ");
//
//		cal1.op = scn.next();// 연산자 입력
//
//		 if문
//
//		if (cal1.op.equals("+")) {
//
//			// +
//			cal1.sum();
//		} else if (cal1.op.equals("-")) {
//			// -
//			cal1.sub();
//		} else if (cal1.op.equals("*")) {
//			// *
//			cal1.mult();
//
//		} else if (cal1.op.equals("/")) {
//			// /
//			cal1.div();
//		}

		System.out.println("---------------------------");

		Calculator1 cal2 = new Calculator1();
		cal2.num1 = 20;
		cal2.num2 = 40;
		cal2.op = "+";
		cal2.opMethod();

		System.out.println();

		Calculator2 c2 = new Calculator2();

		Scanner scn = new Scanner(System.in);
		System.out.println("숫자1");
		int m1 = scn.nextInt();
		System.out.println("숫자2");
		int m2 = scn.nextInt();
		System.out.println("연산자");
		String op2 = scn.next();
		
		c2.opMethod(m1, m2, op2);
		
		scn.close();

//		cal2.sum();

	}

}
