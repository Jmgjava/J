package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectService;
import org.java.service.MemberService;
import org.java.service.MemberUpdateService;

// 클라이언트로 부터 요청 정보를 받고 -> 서비에게 일을 시킨다.
// 서비스에게 받은 결과를 클라어언트에서 보내준다(View)
public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {

		System.out.println("Controller");
		// 1. 서비스에게 일 시킨다
		// 2. 결과를 클라어언트에게 반환(View)

		Scanner input = new Scanner(System.in);
		boolean bool = true;
		MemberService service = null;

		while (bool) {

			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excutQureyService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excutQureyService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excutQureyService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excutQureyService();
			} else if (query.equals("exit")) {
				System.out.println("서비스종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 Fail! -> 다시");
			}

		}

	}
}
