package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectService;
import org.java.service.MemberService;
import org.java.service.MemberUpateService;

import oracle.net.aso.q;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {

		System.out.println("Controller");

		// SQL(관계형데이터베이스 CRUD언어) -> RDBMS(관계형데이터베이스): oracle,mysql
		// insert(C), select(R),update(U),delete(D)

		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문 입력( insert, select,update,delete)");
			String query = input.next();

			MemberService service = null;// 객체형 기본값 null

			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpateService();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 오류");
//				throw new IllegalAccessException("쿼리문 입력 오류");
			}

		}

	}
}
