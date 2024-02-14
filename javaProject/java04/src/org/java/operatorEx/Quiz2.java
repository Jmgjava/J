package org.java.operatorEx;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		System.out.println("=== 계산기 ===");
		// 두 정수와 연산자(+-*/)를 입력받아서
		// 연산자가 +면 더하기, -면 빼기, *면 곱하기, /면 나누기 연산을 수행하시오.

		Scanner esc = new Scanner(System.in);

		System.out.println("첫 번째 정수 입력");
		int one = esc.nextInt();

		System.out.println("두 번째 정수 입력");
		int two = esc.nextInt();

		System.out.println("연산자를 입력하세요(+-*/)");
		String op = esc.next();

		// if문, equals 사용하여 수행

		// op가 + -> one+two 값을 콘솔에 출력
		if (op.equals("+")) {
			System.out.println(one + two);
		}

		// op가 - -> one-two 값을 콘솔에 출력
		if (op.equals("-")) {
			System.out.println(one - two);
		}

		// op가 * -> one*two 값을 콘솔에 출력
		if (op.equals("*")) {
			System.out.println(one * two);
		}

		// op가 / -> one/two 값을 콘솔에 출력
		if (op.equals("/")) {
			System.out.println((double) one / two);
		}

		esc.close();

	}
}
