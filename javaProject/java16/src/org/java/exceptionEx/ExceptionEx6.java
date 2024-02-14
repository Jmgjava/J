package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {

	public static void main(String[] args) {

		System.out.println("Exception");

		Scanner scn = new Scanner(System.in);
		int[] arrInt = new int[5];
		System.out.println("==1==");

		try {
//			for (int i = 0; i < 6; i++) {
//				System.out.println(arrInt[i]);
//			}
			System.out.println("==2==");

			System.out.println("정수 입력: ");
			int num = scn.nextInt();
			System.out.println("입력값: " + num);
			System.out.println("==3==");

			System.out.println("정상실행");
			System.out.println("==4==");

		} catch (InputMismatchException e2) {
			System.out.println("==5-1==");
			System.out.println("타입이 맞지 않음");
			e2.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("==5-2==");
			System.out.println("배열 초과");
			e1.printStackTrace();

		} catch (Exception e) {
			System.out.println("==5-3==");
			System.out.println("위 2가지 예외 외 모든 예외");
			e.printStackTrace();

		} finally {
			System.out.println("==6==");
			System.out.println("무조건 실행");

		}

		System.out.println("==7==");
		System.out.println("프로그램 정상 종료");
	}

}
