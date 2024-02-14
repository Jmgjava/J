package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

// 클라이언트로부터 요청 정보를 받고 -> service에게 일을 시킨다
// service에게 받은 결과값을 클라이언트에서 보내준다(View)
public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("Controller");
		// 1. 서비스에게 일 시킨다.
		// 2. 결과를 클라이언트에게 반환(View)

		MemberService service = null;
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("insert")) {
				// 회원가입
				service = new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				// 회원조회
				service = new MemberSelect();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				// 회원수정
				service = new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				// 회원탈퇴
				service = new MemberDelete();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				bool = false;
			} else {
				System.out.println("다시입력");

			}
		}
	}

}
