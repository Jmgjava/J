package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

class A {

	void m1() throws ArithmeticException {

//		System.out.println(5/0);	

//		throw new SQLException();

		try {
			// 예외를 전졌다.
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class ExceptionEx {

	public static void main(String[] args) {

		int[] arr = new int[5];
		try {
			System.out.println(3 / 1);// 예외발생이 되면 1
			System.out.println("정상실행1");
//			arr[6]=10;
			arr[4] = 10;
			System.out.println("정상실행2");
		} catch (ArithmeticException e) {// 예외 처리 2
			e.printStackTrace();// 예외를 처리하고 정상실행
//			System.out.println("0으로 나누었습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) { // 모든예외 처리
			e.printStackTrace();
		} finally {
			System.out.println("예외와 상관없이 무조건 실행");
			// DB연동 할 때 -> 연동이후에는 반드시 DB연동을 종료
		}

		System.out.println("프로그램 정상 실행");

	}
}
