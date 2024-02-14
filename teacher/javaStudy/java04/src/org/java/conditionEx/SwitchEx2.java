package org.java.conditionEx;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("switch");
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

		// switch case 이용해서
		// 연산자가 +*-/이외의 값이 입력이 되면
		// "연산자 입력 오류" 메시지를 콘솔에 출력
		// 나머지는 변경 없이 수행 하시오.

		switch (op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			break;
		default:
			System.out.println("연산자 입력 오류입니다!. 다시 입력해주세요~");

		}

	}
}
