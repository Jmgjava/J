package org.java.conditionEx;

import java.util.Scanner;

public class If_ex5 {

	public static void main(String[] args) {
		System.out.println("if문");
		// 데이터베이스에 저장 되어 있는 아이디,비빌번호
		String dbId="root";
		String dbPw="1234";
		
		//아이디, 비빌번호를 입력 받아서 둘다 true경우 "로그인 성공"
		//아이디, 비빌번호를 입력 받아서 하나라도 falst경우 "로그인 실패"
		// 콘솔에 출력
		Scanner scn= new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String userId=scn.next();
		
		System.out.print("비빌번호 입력: ");
		String userPw=scn.next();
		//1. 로그인 처리
		if(userId.equals(dbId) && userPw.equals(dbPw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");	
		}
		//2. 로그인 처리
		if(userId.equals(dbId)) {
			// 아이디가 일치
			if(userPw.equals(dbPw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비빌번호가 일치 하지 않습니다.");
				System.out.println("로그인 실패");
			}			
		}else {
			System.out.println("아이디가 일치 하지 않습니다.");
			System.out.println("로그인 실패");			
		}
		
		// -> 인증 , 인가 -> 프레임워크화 시킴  -> Spring Security
		// 로그인 정보, 권한(ROLE), oAuth2.0
		
	}
}
