package org.java.conditionEx;

import java.util.Scanner;

public class If_ex5 {

	public static void main(String[] args) {
		System.out.println("if문");
		// 데이터베이스에 저장 되어 있는 아이디, 비밀번호
		String dbId = "root";
		String dbPw = "1234";

		// 아이디, 비밀번호를 입력받아서 둘다 true경우 "로그인 성공"
		// 아이디, 비밀번호를 입력받아서 하나라도 false경우 "로그인 실패"

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디 입력: ");
		String userId = scn.next();
		System.out.println("비밀번호 입력: ");
		String userPw = scn.next();

		// 아이디와 비밀번호가 같을 경우
		if (dbId.equals(userId)) {
			if (dbPw.equals(userPw)) {
				System.out.println("로그인 성공");
			} else {
				// 비밀번호만 틀림
				System.out.println("비밀번호가 틀렸습니다.");
				System.out.println("로그인 실패");
			}
		} else { // 아이디만 틀림
			System.out.println("아이디가 틀렸습니다.");
			System.out.println("로그인 실패");
		}
		// -> 인증, 인가 -> 프레임워크화 시킴 -> Spring Security
		// 로그인 정보, 권한(ROLE), oAuth2.0
		
		scn.close();
	}

}
