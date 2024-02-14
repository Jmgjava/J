package org.java.loopEx;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {

		System.out.println("for문");
		// 구구단 시작단, 끝단을 입력받아서(정수) 구구단을 출력
		// 예 ) 시작단 4, 끝단 7 -> 4단 부터 5,6,7 단이 콘솔에 출력
		// 4*4=16 ....... 7*9=63
		// 단, 조건이 시작단이 끝단보다 작아야 된다.
		// 만약에 시작단이 끝단보다 작지 않으면 "시작단이 끝단보다 작아야 합니다." 콘솔 출력
		// if else문, for문

		Scanner scn = new Scanner(System.in);
		System.out.println("시작단 입력");
		int start = scn.nextInt(); // 비교연산자 -> int형

		System.out.println("끝단 입력");
		int last = scn.nextInt(); // 비교연산자 -> int형

		if (start < last) {
			
			System.out.println("시작단: "+start+" 끝단: "+last);
			
			for (int i = start; i <= last; i++) {
				System.out.println(i + "단");

				for (int a = 2; a <= 9; a++) {
					System.out.println(i + "*" + a + "=" + (i * a));
				}
			}
		} else {
			System.out.println("시작단이 끝단보다 작아야 합니다.");
		}

	}

}
