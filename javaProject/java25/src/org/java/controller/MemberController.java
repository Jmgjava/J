package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberSelectOne;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("controller");

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
			} else if (query.equals("selectone")) {
				// 회원조회
				service = new MemberSelectOne();
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
				// 종료
				System.out.println("종료");
				bool = false;
			} else {
				System.out.println("입력 오류");
			}
		}
	}

}
