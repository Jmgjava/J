package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// "예외를 처리하고 정상적으로 프로그램을 수행할 목적" -> 목적(정상종료)
		System.out.println("Exception");

		Scanner input = new Scanner(System.in);
		int[] arrInt = new int[5];
		System.out.println("1->");
		try {
//			for (int i = 0; i < 6; i++) {
//				System.out.println(arrInt[i]);
//			}
			System.out.println("2->");

			System.out.println("정수 입력: ");
			int num = input.nextInt();
			System.out.println("입력값: " + num);
			System.out.println("3->");

			System.out.println("정상 실행");
			System.out.println("4->");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("5->1");
			System.out.println("예외 발생");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("5->2");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("5-> 위2가지 제외 모든 예외 처리");
			e.printStackTrace();
		} finally {
			System.out.println("6->");
			System.out.println("무조건 실행");
		}

		System.out.println("7->");
		System.out.println("프로그램 정상 종료");

	}
}
