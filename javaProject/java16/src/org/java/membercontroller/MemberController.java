package org.java.membercontroller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.memberservice.MemberDeleteService;
import org.java.memberservice.MemberInsertService;
import org.java.memberservice.MemberSelectService;
import org.java.memberservice.MemberService;
import org.java.memberservice.MemberUpdateService;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {
		System.out.println("Controller");

		// 쿼리문입력
		MemberService service = null;
		Scanner scn = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문 입력(insert,update,select,delete)");
			String query = scn.next();
			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("회원관리 종료");
				bool = false;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}

	}

}
