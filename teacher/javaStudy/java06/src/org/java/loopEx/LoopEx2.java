package org.java.loopEx;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		System.out.println("반복문");

		// 1~10 중에서 짝수만 콘솔에 출력 ->for

		for (int i = 0; i < 10; i++) {
			int i2 = i + 1;
			// 1. if~else
//			if(i2%2==0) {
//				System.out.println("짝수: "+i2);
//			}else {
//				System.out.println("홀수: "+i2);				
//			}
			// 2. continue
			if (i2 % 2 == 0) {
				System.out.println("짝수: " + i2);
				continue;
			}
		} // continue

		System.out.println("while");

		Scanner scn = new Scanner(System.in);

		// 권한을 입력하면 ADMIN입력하면 -> "당신의 권한은 ADMIN입니다" 출력
		// exit입력하면 while문 종료
		// 위 권한및 exit 이외의 문자열을 입력하면 -> "다시 입력해 주세요" 출력
		// while문 이용해서 작성, 조건문 -> switch , if

		while (true) {

			System.out.println("권한을 입력하세요(ADMIN,MEMBER,SELLER)");
			String user_ROLE = scn.next();

			if (user_ROLE.equals("ADMIN")) {
				System.out.println("당신의 권한은 ADMIN입니다");
			} else if (user_ROLE.equals("MEMBER")) {
				System.out.println("당신의 권한은 MEMBER입니다");
			} else if (user_ROLE.equals("SELLER")) {
				System.out.println("당신의 권한은 SELLER입니다");
			} else if (user_ROLE.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해 주세요");
			}
		}
		scn.close();
		System.out.println("main 종료");

	}
}
