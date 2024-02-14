package org.java.exceptionEx2;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx10 {
											// SQL 관련 예외 -> DB연관
											// 서비스중 DAO관련 모든 메소드에 적용
											// 서비스 구현객체 -> 인터페이스
	public static void main(String[] args) throws SQLException {

		System.out.println("Exception");

		Scanner input = new Scanner(System.in);
		System.out.println("나누는 수 입력: ");

		double avg = 0.0;

		try {
			int num = input.nextInt();
//			avg = (double) 10 / num;
			avg = (double) (10 / num);

			// 예외 발생시 실행 안됨
			System.out.println("예외 없음");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace();
			// catch(error)에서 "error"라는 에러가 나지 않는다면 이 구문은 실행되지 않음.
		} catch (InputMismatchException e) {
			System.out.println("타입이 맞지 않음");
			e.printStackTrace();
		} catch (NumberFormatException e) { // "111", "ffgwe"
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// **입력받은 인자(매개인자)가 틀릴 경우
			// 비밀번호 오류, 검색어 , 화가이비...
			e.printStackTrace();
		} finally {
			System.out.println("예외와 상관없이 무조건 실행");
		}

		System.out.println("평균: " + avg);
		System.out.println("프로그램 완료");

		input.close();
	}

}
