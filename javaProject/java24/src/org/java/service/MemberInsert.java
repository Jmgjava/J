package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("회원가입");

		// 싱글톤
		MemberDao dao = MemberDao.getInstance();

		Scanner input = new Scanner(System.in);
		System.out.println("ID: ");
		String userId = input.next();

		System.out.println("PW: ");
		String userPw = input.next();

		System.out.println("나이: ");
		int age = input.nextInt();

		System.out.println("이름: ");
		String name = input.next();

		int result = dao.insert(userId, userPw, age, name);

		if (result != 1) {
			System.out.println("회원가입 실패!");
		}else {
			System.out.println("회원가입 성공!");
		}
	}

}
