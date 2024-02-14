package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {

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

		} catch (ArithmeticException e4) { // 0으로 나눌 떄
			e4.printStackTrace();

		} catch (InputMismatchException e3) { // 입력값 타입 오류
			e3.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e2) { // 배열 인덱스 오류
			e2.printStackTrace();

		} catch (Exception e1) {
			// 예상 예외이외의 모든 예외를 처리
			e1.printStackTrace();
			System.out.println("모든 예외 처리");

		} finally {
			System.out.println("기본 실행");

		}
	}

}
