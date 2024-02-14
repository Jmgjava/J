package org.java.loopEx;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		System.out.println("for문");

//		// 0~10 정수를 출력
//		for (int i = 0; i < 10; i++) {
//
//			if (i == 9) {
//				// i가 8보다 클 때만 실행
//				System.out.print(i);
//			} else
//				System.out.print(i + ",");
//		}

		// 9~0 1작은 반복문

		System.out.println("숫자 9~0");

		for (int i = 9; i >= 0; i--) {
			// break 사용 i==0일 경우 0 -> for문 종료
			if (i == 0) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ",");
		} // break
		
		// Scanner이용, 변수 2개
		// 첫 번째 숫자, 두 번째 숫자를 입력 받아서(정수형)
		// 첫 번째 숫자부터 두 번째 숫자까지 콘솔에 출력
		// 예시) 1, 5 -> 1,2,3,4,5 // for문
		// for (int i=첫 번째; 첫 번째 < 두 번째; i++)
		// 조건이 첫번째 숫자<두번째 숫자 // if문
		// 위 조건이 false면 "첫 번째 숫자는 반드시 두 번째 숫자보다 작아야한다" 콘솔에 출력
		// if,for을 이용해서 수행 해보세요.

		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력: ");
		int Num1 = scn.nextInt();

		System.out.println("두 번째 정수 입력: ");
		int Num2 = scn.nextInt();

		if (Num1 < Num2) {
			// 1 < 5 - > 1234
			// 1 <= 5 -> 12345
			for (int i = Num1; i <= Num2; i++) {
				// i -> 1,2,3,4,5 <-> 5
				if (i == Num2) {
					System.out.print(i); // 5--5
					break; // 마지막일 경우만 실행 하고
				}
				// break문 이후의 명령문은 실행 되지 않는다.
				System.out.print(i + ",");
			} // break;
		} else {
			System.out.println("첫 번째 숫자는 반드시 두 번째 숫자보다 작아야한다");
		}
		
		scn.close();
		
		
		
		
		
		
	}
}
