package org.java.loopEx;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		System.out.println("while");
		
		// 테스트 코드 사용 할수 있다.
		//  입력값이 insert면 -> 회원가입
		//  입력값이 select면 -> 회원조회
		//  입력값이 update면 -> 회원수정
		//  입력값이 delete면 -> 회원탈퇴
		//  입력값이 exit면 -> 프로그램 종료
		//  입력값이 위 5가지 제외하면 -> 다시 입력해주세요 -> 콘솔에 출력
		// if~else if~ else이용해서 수행 해보세요
		
		
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			System.out.println("쿼리문을 입력해주세요");
			System.out.print("쿼리문: ");
			
			String query=scn.next();			
			// if~else if~ else이용해서 수행 해보세요
			
			// Create Read Update Delete -> CRUD
			if(query.equals("insert")) {
				System.out.println("회원가입");// 상품등록, 장바구니,게시글등록
			}else if(query.equals("select")) {
				System.out.println("회원조회");// 상품조회,장바구니, 게시글 조회,검색
			}else if(query.equals("update")) {
				System.out.println("회원수정");// 상품수정,장바구니수정, 게시글 수정
			}else if(query.equals("delete")) {
				System.out.println("회원탈퇴");// 상품삭제,장바구니사젝, 게시글 삭제
			}else if(query.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
		}
		
		scn.close();
		System.out.println("main종료");
		
		
		
	}
}
