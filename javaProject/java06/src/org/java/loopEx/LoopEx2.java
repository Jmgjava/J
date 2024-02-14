package org.java.loopEx;

import java.util.Scanner;

public class LoopEx2 {
	public static void main(String[] args) {

		System.out.println("반복문");

		// 1부터 10까지 중에서 짝수만 콘솔에 출력

		// 1. if-else
		for (int i = 1; i <= 10; i++) {
//			if(i%2==0) {
//				System.out.println("짝수: "+i);
//			}else {
//				System.out.println("홀수: "+i);
//			}

			// 2. continue
			if (i % 2 == 0) {
				System.out.println("짝수: " + i);
				continue;
			}
		}

		System.out.println("while");

		Scanner scn = new Scanner(System.in);

		// 권한 ADMIN을 입력하면 -> "당신의 권한은 ADMIN입니다" 출력
		// exit 입력하면 while문 종료
		// 위 권한 및 exit이외의 문자를 입력하면 "다시 입력하세요" 출력
		// while문 이용해서 작성, 조건문 switch,if

		boolean i=true;
		
		while (i) {
			System.out.println("권한을 입력하세요(ADMIN, MEMBER, SELLER)");
			String userId = scn.next();

			
			switch (userId) {
			
		
			
			case "ADMIN":
				System.out.println("당신의 권한은 ADMIN입니다");
				break;

			case "MEMBER":
				System.out.println("당신의 권한은 MEMBER입니다");
				break;

			case "SELLER":
				System.out.println("당신의 권한은 SELLER입니다");
				break;

			case "EXIT":
				System.out.println("프로그램 종료");
				i=false;
				break;

			default:
				System.out.println("다시 입력하세요");
			}

		}
//		System.out.println("main 종료");
		

	}

}
