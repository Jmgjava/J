package org.java.controller;

import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberUpdate;

// 사용자(클라이언트) 요청 받아서 -> 서비스에 일을 시키고
// -> 서비스에서 결과값을 받아서 -> 사용자(클라이언트)에게 되돌려줌(View)
public class MemberController {

	public static void main(String[] args) {

		// 다형성
		// 부모타입 객체 참조 변수로 자식객체 참조
		MemberService mService = null;
		Scanner scn = new Scanner(System.in);

		// query가 insert면 MemberInsert "회원가입"
		// query가 select면 MemberSelect "회원조회"
		// query가 update면 MemberUpdate "회원수정"
		// query가 delete면 MemberDelete "회원삭제"
		// query가 exit면 "query문 종료"
		// query가 위의 것 외라면 "query문 입력오류"
		// 가 각각 해당하는 excuteQueryService 출력되도록
		// if-else if~else 활용해서
		// 프로그래밍 해보세요.

		// while문 이용해서 -> exit -> while문 종료

		boolean bool = true;

		while (bool) {

			System.out.println("insert, select, update, delete, exit \n 작업을 입력하세요: ");

			String query = scn.next();

			if (query.equals("insert")) {
				// 회원가입 일을 시킨다.
				mService = new MemberInsert();
				mService.excuteQueryService();

			} else if (query.equals("select")) {
				// 회원조회 일을 시킨다.
				mService = new MemberSelect();
				mService.excuteQueryService();

			} else if (query.equals("update")) {
				// 회원수정 일을 시킨다.
				mService = new MemberUpdate();
				mService.excuteQueryService();

			} else if (query.equals("delete")) {
				// 회원탈퇴 일을 시킨다.
				mService = new MemberDelete();
				mService.excuteQueryService();

			} else if (query.equals("exit")) {
				System.out.println("query문 종료");
				bool = false;
			} else {
				System.out.println("query문 입력오류");
			}

		}
		scn.close();
	}

}
