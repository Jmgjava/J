package org.java.loopEx;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {

		System.out.println("while");

		// 테스트 코드 사용할 수 있다.
		// 입력값이 insert면 -> 회원가입
		// 입력값이 select면 -> 회원조회
		// 입력값이 update면 -> 회원수정
		// 입력값이 delete면 -> 회원삭제
		// 입력값이 exit면 -> 프로그램 종료
		// 입력값이 위 네가지 제외하면 -> "틀린 명령어"

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("쿼리문을 입력해주세요.");
			System.out.println("쿼리문: ");

			String query = scn.next();
			// if-else if ~else 이용하여 수정 해보시오
			// CRUD( Create Read Update Delete )
			if (query.equals("insert")) {
				System.out.println("회원가입"); // 상품 등록, 장바구니,게시글 등록
			} else if (query.equals("select")) {
				System.out.println("회원조회"); // 상품 조회, 장바구니,게시글 조회,검색
			} else if (query.equals("update")) {
				System.out.println("회원수정"); // 상품 수정, 장바구니수정,게시글 수정
			} else if (query.equals("delete")) {
				System.out.println("회원삭제"); // 상품 삭제, 장바구니 삭제, 게시글 삭제
			} else if (query.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("틀린 명령어. 다시 입력해주세요.");
			}
			scn.close();

		}
	}
}