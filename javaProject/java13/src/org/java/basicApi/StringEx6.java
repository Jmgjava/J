package org.java.basicApi;

import java.util.Scanner;

public class StringEx6 {

	public static void main(String[] args) {

		// Scanner를 이용해서 입력값이 ".do"로 끝나면 회원관리 실행(while)
		// 입력값이 "exit" -> 전체 while문 종료
		// 입력값이 .do, exit 이외ㅡ이 값을 입력하면 -> 다시입력 콘솔

		// 안의 while문 -> ".do면" 회원관리 실행
		// "/insert.do"입력되면 /insert -> "회원가입"
		// "/update.do"입력되면 /update -> "회원수정"
		// "/select.do"입력되면 /select -> "회원조회"
		// "/delete.do"입력되면 /delete -> "회원삭제"
		// 잘못 입력하면. -> "다시 입력해주세요"
		// "exit.do" 입력되면 -> 전체 while문이 종료

		Scanner scn = new Scanner(System.in);
		System.out.println("사용자 요청 정보 입니다. ( .do 입력 )");

		boolean bool = true;
		while (bool) {
			System.out.println("요청정보 입력: ");
			
			String input = scn.next();
//			System.out.println(input);
			
			String d1 = input.substring(input.length() - 3); // .do
//			System.out.println(d1);

			if (d1.equals(".do")) {
//				System.out.println("요청 정보 ->" + input);
				String fi = input.substring(0, input.length() - 3);
//				System.out.println(".do제외 ->" + fi);

				if (fi.equals("/insert")) {
					System.out.println("회원가입");
				} else if (fi.equals("/update")) {
					System.out.println("회원수정");
				} else if (fi.equals("/select")) {
					System.out.println("회원조회");
				} else if (fi.equals("/delete")) {
					System.out.println("회원삭제");
				} else {
					System.out.println("다시입력");
				}
			} else if (input.equals("/exit.do")) {
				System.out.println("프로그램 종료");
				bool = false;
			} else {
				System.out.println("틀렸습니다. 다시 입력하세요");
			}
		}
	}
}
