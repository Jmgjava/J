package org.java.conditionEx;

import java.util.Scanner;

public class if_ex4 {

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

		// if~else if~else
		// 연산자가 +*-/ 이외의 값이 입력이 되면
		// "연산자 입력 오류"메세지를 콘솔에 출력
		// 나머지는 변경 없이 수행

		if (op.equals("+")) {
			System.out.println(one + two);
		} else if (op.equals("-")) {
			System.out.println(one - two);
		} else if (op.equals("*")) {
			System.out.println(one * two);
		} else if (op.equals("/")) {
			System.out.println((double) one / two);
		} else {
			System.out.println("연산자 입력 오류");
		}

		esc.close();
	}

}