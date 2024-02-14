package org.java.loopEx;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		System.out.println("while");
		System.out.println("구구단");

		int i = 1;

		while (i < 9) {
			i++;
			System.out.println(i + "단입니다.");

			int j = 0; // 0123456789 -> 다시 초기화 시켜야 한다. j -> 0
			while (j < 9) {
				j++;
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			// j -> 10
		}
		
		System.out.println("============================================");

		// Scanner이용, 변수 2개
		// 첫 번째 숫자, 두 번째 숫자를 입력 받아서(정수형)
		// 첫 번째 숫자부터 두 번째 숫자까지 콘솔에 출력
		// 예시) 1, 5 -> 1,2,3,4,5 // while문
		// 조건이 첫번째 숫자<두번째 숫자 // if문
		// 위 조건이 false면 "첫 번째 숫자는 반드시 두 번째 숫자보다 작아야한다" 콘솔에 출력
		// if,while을 이용해서 수행 해보세요.

		Scanner scn = new Scanner(System.in);
		System.out.println("시작 단: ");
		int Num1 = scn.nextInt();

		System.out.println("끝 단: ");
		int Num2 = scn.nextInt();

		if (Num1 < Num2) {

			while (Num1 <= Num2) {
				System.out.println(Num1 + "단입니다.");

				int j = 0;
				while (j < 9) {

					j++;
					System.out.println(Num1 + "*" + j + "=" + (Num1 * j));
				}
				Num1++;
			}
		}

	}

}
