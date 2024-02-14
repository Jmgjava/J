package org.java.loopEx;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		System.out.println("while");
		System.out.println("구구단");

		int i = 1;

		while (i < 9) {
			i++;
			System.out.println(i + "단입니다");

			int j = 0;// 0123456789 -> 다시 초기화 시켜야 된다. j-> 0
			while (j < 9) {
				j++;
				System.out.print(i + "*" + j + "=" + (i * j));
			}
			// j-> 10
		}

		System.out.println();

		// Scaner이용, 변수 2개
		// 첫번째 숫자, 두번째 숫자를 입력 받아서(정수형)
		// 첫번째 숫자부터 두번째 숫자까지 콘솔에 출력
		// 예시) 1, 5 -> 1,2,3,4,5 // while문
		// 조건이 첫번째 숫자<두번째 숫자 // if문
		// 위 조건이 false면 "첫번째 숫자는 반드시 두번째 숫자보다 작아야된다" 콘솔에 출력
		// if,while을 이용해서 수행 해보세요,
		Scanner scn = new Scanner(System.in);
		
		System.out.print("시작단: ");
		int firstNum = scn.nextInt();

		System.out.print("끝단: ");
		int secondNum = scn.nextInt();

		if (firstNum < secondNum) {
			while (firstNum <= secondNum) {
				
				System.out.println(firstNum + "단입니다");

				int j = 0;
				while (j < 9) {
					j++;
					System.out.println(firstNum + "*" + j + "=" + (firstNum * j));
				}
				firstNum++;
			}

		} else {
			System.out.println("첫번째 숫자는 반드시 두번째 숫자보다 작아야된다");
		}

	}
}
