package org.java.loopEx;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		System.out.println("반복문");		
		System.out.println("while");
		
		Scanner scn=new Scanner(System.in);		
		// 권한을 입력하면  ADMIN입력하면 ->  "당신의 권한은 ADMIN입니다" 출력
		// exit입력하면 while문 종료
		// 위 권한및 exit 이외의 문자열을 입력하면 -> "다시 입력해 주세요" 출력
		// while문 이용해서 작성, 조건문 -> switch , if
		
		boolean bool=true;
		
		while(bool) {	// true일 때만 실행 -> false, 변수
			
			System.out.println("권한을 입력하세요(ADMIN,MEMBER,SELLER)");		
			String user_ROLE=scn.next();
			
			switch(user_ROLE) {
			case "ADMIN":
				System.out.println("당신의 권한은 ADMIN입니다" );
				break;
			case "MEMBER":
				System.out.println("당신의 권한은 MEMBER입니다" );
				break;
			case "SELLER":
				System.out.println("당신의 권한은 SELLER입니다" );				
				break;
			case "exit":
				System.out.println("종료합니다." );
				bool=false; // while문 종료
				break;
			default:
				System.out.println("다시 입력해 주세요" );		
			}//break
			
		}
		
//		System.out.println("main 종료");
		
	}
}
