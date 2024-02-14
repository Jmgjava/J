package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {

		System.out.println("Exception");

		Scanner input = new Scanner(System.in);
		System.out.println("10 / 나누는 수 입력(정수,0제외): ");
		int i = 10;

		try {
			// 예외가 발생 할 예상 코드 위치 try{}
			// 1.
			double d = i / input.nextInt(); // ArithmeticException -> 0으로 나누었을 때 예외
			// 예외 발생 위치 이후의 명령문은 실행 되지 않는다. try{}안
			// 2.
			System.out.println(d);
			System.out.println("예외가 발생하지않고 정상 실행");

		} catch (ArithmeticException e) {
			// 3. 예외가 발생 시 -> 예외가 발생이 안되면 catch문 실행안됨
			e.printStackTrace(); // 콘솔에 예외 정보출력
			System.out.println("예외내용: " + e.getMessage()); // 예외정보를 문자열로 출력
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {

			// 4.
			System.out.println("예외 유무와 상관없이 무조건 실행");
		}
		// 5.
		System.out.println("프로그램 정상종료");
	}

}
