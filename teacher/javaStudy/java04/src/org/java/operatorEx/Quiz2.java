package org.java.operatorEx;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		System.out.println("==== 계산기 =====");

//		두정수와 연산자(+-*/)를 입력을 받아서
//		연산자가 +면 더하기, -면 빼기, *면 곱하기, /면 나누기 연사을 수행 하시오		
		Scanner scn = new Scanner(System.in);

		System.out.print("숫자1입력: ");
		int num1 = scn.nextInt();

		System.out.print("숫자2입력: ");
		int num2 = scn.nextInt();

		System.out.println("연산자를 입력 하세요(+-*/)");
		String op = scn.next();

		// if문(조건이 하나), equals이용 수행 해보세요

		// op가 + -> num1+num2 값을 콘솔에 출력
		if (op.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		}
		// op가 - -> num1-num2 값을 콘솔에 출력
		if (op.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		}
		// op가 * -> num1*num2 값을 콘솔에 출력
		if (op.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		}
		// op가 / -> num1/num2 값을 콘솔에 출력
		if (op.equals("/")) {
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
		}

	}
}
