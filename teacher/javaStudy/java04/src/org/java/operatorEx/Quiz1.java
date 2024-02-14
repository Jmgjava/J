package org.java.operatorEx;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		System.out.println("=== 홀짝 =====");

		// Scanner를 이용해서 정수를 입력받아서 홀짝프로그램을 수행 하시오.
		// Scanner, if문, 산술연산자, 대입연산자
		// 출력값이 "짝수입니다", "홀수입니다" 으로 출력해보세요
		// 2로 나누었을 때 나머지가 0이면 짝수, 나머지 홀수

		Scanner scn = new Scanner(System.in);

		System.out.print("정수값 입력: ");
		int num1 = scn.nextInt();// 정수 값 입력

		if (num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		scn.close();

	}
}
