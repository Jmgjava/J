package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원가입");

		Scanner input = new Scanner(System.in);

		System.out.println("회원 번호: ");
		int no = input.nextInt();
		System.out.println("회원 ID: ");
		String userId = input.next();
		System.out.println("회원 PW: ");
		String userPw = input.next();
		System.out.println("회원 이름: ");
		String name = input.next();
		System.out.println("회원 나이: ");
		int age = input.nextInt();

		MemberDao dao = new MemberDao();
		int rs = dao.insert(no, userId, userPw, name, age);

		if (rs != 1) {
			System.out.println("회원가입 실패");
		} else {
			System.out.println("회원가입 성공");
		}

	}

}
