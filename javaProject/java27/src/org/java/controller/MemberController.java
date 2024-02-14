package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberCheck;
import org.java.service.MemberDelete;
import org.java.service.MemberExist;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("컨트롤러");

		MemberService service = null;
		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {

			System.out.println("쿼리문 입력");
			String query = input.next();

			if (query.equals("insert")) {
				service = new MemberInsert();
				service.executequeryService();
			} else if (query.equals("select")) {
				service = new MemberSelect();
				service.executequeryService();
			} else if (query.equals("check")) {
				service = new MemberCheck();
				service.executequeryService();
			} else if (query.equals("update")) {
				service = new MemberUpdate();
				service.executequeryService();
			} else if (query.equals("delete")) {
				service = new MemberDelete();
				service.executequeryService();
			} else if (query.equals("exist")) {
				service = new MemberExist();
				service.executequeryService();
			} else if (query.equals("exit")) {
				System.out.println("프로그램 종료");
				bool = false;
			} else {
				System.out.println("잘못된 값 입력. 다시 입력하세요");
			}

		}

	}

}
