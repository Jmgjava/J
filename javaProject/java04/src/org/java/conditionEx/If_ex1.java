package org.java.conditionEx;

import java.util.Scanner;

public class If_ex1 {

	public static void main(String[] args) {
		System.out.println("if");
		// 1.조건이 하나일 경우
		// 사용자 권한 관리자(ADMIN), 일반회원(MEMBER), 판매자(SELLER)
		System.out.println("관리자 권한: " + Role.ROLE1);
		System.out.println("일반 권한: " + Role.ROLE2);
		System.out.println("판매자 권한: " + Role.ROLE3);

		// 콘솔에 사용자 권한을 입력 받아서
		// 권한이 ADMIN 이면 "관리자 페이지로 이동" 콘솔에 출력
		// 권한이 MEMBER 면 "일반회원 페이지로 이동" ''
		// 권한이 SELLER 면 "판매자 페이지로 이동" ''
		// 등록 되어 있는 권한

		String user_ROLE = "ADMIN,MEMBER,SELLER";
		System.out.println("접속자의 권한: " + user_ROLE);

		Scanner scn = new Scanner(System.in);
		System.out.println("권한 입력: ");
		String input_ROLE = scn.next();

		if (input_ROLE.equals("ADMIN")) {
			System.out.println("관리자 페이지로 이동");
		} else if (input_ROLE.equals("MEMBER")) {
			System.out.println("일반 회원 페이지로 이동");
		} else if (input_ROLE.equals("SELLER")) {
			System.out.println("판매자 페이지로 이동");
		} else {
			System.out.println("권한이 없습니다");
		}

	}

}
