package org.java.loopEx;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		System.out.println("for문");

		// i++; // i=i+1;
		for (int i = 0; i < 10; i++) {
			// 0,1,2,3,4,5,6,7,8,9
//			if(i==9)
//			if(i>8) {// i가 8보다 클때만 실행
//				System.out.println(i);
//			}else {
//				System.out.print(i+",");			
//			}

			if (i > 8) {
				System.out.println(i);
				break;
			}
			System.out.print(i + ",");

		} // break

		System.out.println("9~0");
		// 9~0 1작은 반복문

		for (int i = 9; i >= 0; i--) {
			// break사용 i==0일 경우 0 ->for문 종료
			if (i == 0) {
				System.out.println(i);
				break;
			}
			System.out.print(i + ",");
		} // break

		System.out.println();

		// Scaner이용, 변수 2개
		// 첫번째 숫자, 두번째 숫자를 입력 받아서(정수형)
		// 첫번째 숫자부터 두번째 숫자까지 콘솔에 출력
		// 예시) 1, 5 -> 1,2,3,4,5 // for문
		// for(int i=첫번째; 첫번째<두번째; i++)
		// 조건이 첫번째 숫자<두번째 숫자 // if문
		// 위 조건이 false면 "첫번째 숫자는 반드시 두번째 숫자보다 작아야된다" 콘솔에 출력
		// if,for을 이용해서 수행 해보세요,

		Scanner scn = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int firstNum = scn.nextInt();

		System.out.print("두번째 숫자: ");
		int secondNum = scn.nextInt();

		if (firstNum < secondNum) {
			// 1 < 5 -> 1234
			// 1 <=5 -> 12345
			for (int i = firstNum; i <= secondNum; i++) {
				// i-> 1,2,3,4,5 <->5
				if (i == secondNum) {
					System.out.println(i);// 5==5
					break;// 마지막일 경우만 실행 하고
				}
				// break문이후에 명령문은 실행 되지 않는다
				System.out.print(i + ",");
			} // break;

		} else {
			System.out.println("첫번째 숫자는 반드시 두번째 숫자보다 작아야된다");
		}

	}
}
