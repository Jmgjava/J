package org.java.exceptionEx;

import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		System.out.println("다중 Exception");
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("숫자를 입력: ");
			int num2 = input.nextInt();
			System.out.println(num2); // 잘못된 값을 입력
			System.out.println(num1 / num2); // 0으로 나눔
			System.out.println(arrInt[5]); // 배열 인덱스 초과
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
		} catch (Exception e1) { // 0으로 나눌때
			e1.printStackTrace();
		} finally {
			System.out.println("종료");
		}
	}

}
