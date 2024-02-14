package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectService;
import org.java.service.MemberService;
import org.java.service.MemberUpdateService;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {

		System.out.println("컨트롤러");

		// 쿼리문 입력
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		MemberService service = null;

		while (bool) {

			System.out.println("쿼리문 입력(insert,update,delete,select)");
			String query = input.next();

			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("회원관리 종료");
				bool = false;
			} else {
				System.out.println("쿼리문입력 오류~!");
			}

		}

	}
}
