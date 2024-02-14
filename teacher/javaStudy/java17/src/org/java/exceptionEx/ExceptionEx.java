package org.java.exceptionEx;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
											// SQL관련 예외 -> DB연관 
											// 서비스중 DAO관련 모든 매서드에 적용
											// 서비스 구현객체 -> 인터페이스
	public static void main(String[] args) throws SQLException  {
		
		System.out.println("Excetpion");

		Scanner input = new Scanner(System.in);

		System.out.print("나누는 수 입력: ");
		int num = input.nextInt();

		double avg = 0.0;

		try {
			avg = (double) (10 / num); // 예외 발생
//			avg = (double) 10 / num; // double/ int -> double/double ->10 /0.0
			// 예외 발생 시 실행 X ↓
			System.out.println("예외 없이 실행!!");
		} catch (InputMismatchException e) {
			// InputMismatchException -> 처리
			// InputMismatchException 발생 안되면 X
			e.printStackTrace();
		} catch(NumberFormatException e) {  // "111" "fdsfda"
			e.printStackTrace();
		} catch(IllegalArgumentException e) { 
			// *** 입력 받은 인자(매개인자) 가 틀릴 경우
			// 비빌번호 오류, 검색어 , 회가이비,,,,
			e.printStackTrace();
		} catch(ArithmeticException e) {
			e.printStackTrace();//
		}
		
		
		finally {
			System.out.println("예외 발생과 상관 없이 무조건 실행");
		}

		// 예외를 처리 하고 정상 실행

		System.out.println("평균: " + avg);
		System.out.println("정상종료!!");
		input.close();
		

	}
}
