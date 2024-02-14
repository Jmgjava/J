package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberUpdateService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원수정");

		// 조회할 회원을 불러와서 수정 시켜야 된다.
		Scanner input = new Scanner(System.in);

		System.out.println("아이디");
		String userId = input.next();

		System.out.println("비빌번호");
		String userPw = input.next();

		System.out.println("나이");
		int age = input.nextInt();

		System.out.println("이름");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();

		int result = dao.update(userId, userPw, age, name);

		if (result != 1) {
			System.out.println("회원수정 Fail!");
		} else {
			System.out.println("회원수정 Success!");
		}

	}
}
