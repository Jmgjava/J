package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectOneService;
import org.java.service.MemberSelectService;
import org.java.service.MemberService;
import org.java.service.MemberUpdateService;

public class MemberController {

	public static void main(String[] args) throws IOException, Exception {
		System.out.println("Controller");

		MemberService service = null;
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {

			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.executeQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.executeQueryService();
			}else if (query.equals("selectOne")) {
				service = new MemberSelectOneService();
				service.executeQueryService();
			}  else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.executeQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.executeQueryService();
			} else if (query.equals("exit")) {
				System.out.println("서비스종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 Fail! -> 다시");
			}

		}
	}
}
