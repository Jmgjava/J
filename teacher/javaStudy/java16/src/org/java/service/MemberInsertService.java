package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {

		System.out.println("회원가입");

		// DAO
		Scanner input = new Scanner(System.in);

		System.out.print("회원번호: ");
		int no = input.nextInt();

		System.out.print("아이디: ");
		String userId = input.next();

		System.out.print("비빌번호: ");
		String userPw = input.next();

		System.out.print("이름: ");
		String name = input.next();

		System.out.print("나이: ");
		int age = input.nextInt();

		// 서비스에서DB관련 시킨일 수행 DAO-><-DB
		MemberDao dao = new MemberDao();
		// DB 테이블에 데이터를 저장
		int rs = dao.insert(no, userId, userPw, name, age);

		if (rs != 1) {
			System.out.println("회원가입 실패");
		} else {
			System.out.println("회원가입 성공");
		}

	}

}
