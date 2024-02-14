package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		System.out.println("다중 Excetption 1");		
		
		int num1 = 10;
		int[] arrInt = new int[5];
		
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("숫자를 입력: ");
			int num2 = input.nextInt();			
			System.out.println(num2);   // 잘못된 값을 입력 
			System.out.println(num1 / num2);// 0으로 나눔
			System.out.println(arrInt[5]);//배열 인덱스 초과
			System.out.println("OK");
			
		}catch (ArithmeticException e1) { //0으로 나눌때
			e1.printStackTrace();
		}catch (InputMismatchException e2) { // 입력값 타입오류
			e2.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e3) {// 배열 인덱스 오류
			e3.printStackTrace();
		}finally {
			System.out.println("기본실행");
		}
		System.out.println("프로그램 정상 실행");

	}
}
