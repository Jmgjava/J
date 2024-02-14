package org.java.basicApi;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		System.out.println("Random");

		Random rd = new Random();

		// 5번실행 -> 임의의 정수값을 추출
		for (int i = 0; i < 5; i++) {
			int rdInt = rd.nextInt();
			System.out.println(rdInt);
			System.out.println(Integer.toBinaryString(rdInt));
			// 2진수 문자열
		}

		System.out.println();

		System.out.println(Integer.toBinaryString(10));

		System.out.println();

		// 5번 실행 -> 범위 가 정해진 정수
		for (int i = 0; i < 5; i++) {
			System.out.print(rd.nextInt(45) + " ");
		}

		System.out.println();

		System.out.println();
		// 5번실행 -> 랜덤 소수점 2자라
		for (int i = 0; i < 5; i++) {
			System.out.printf("%.2f \n", rd.nextDouble());
		}

		System.out.printf("%d+%d=%d", 5, 15, (5 + 15));

	}
}
