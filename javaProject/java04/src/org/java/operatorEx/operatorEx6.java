package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx6 {

	public static void main(String[] args) {

		// 아이디와 비밀번호를 입력받아서
		// 입력받은 아이디가 dbId와 입력받은 비밀번호 dbPw가 동시에 일치 하면
		// 콘솔에 "로그인 성공" 실패하 하면 "로그인 실패"가 출력되도록 프로그래밍 하시오.
		// Scanner, equals, &&, if~else문을 활용하여 작성하시오.

		String Id = "id";
		String Pw = "pw";

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디: ");
		String userId = scn.next();// return 반환된다 -> 문자열

		System.out.println("비밀번호: ");
		String userPw = scn.next();

		if (userId.equals(Id) && (userPw.equals(Pw))) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		scn.close();
	}
}
