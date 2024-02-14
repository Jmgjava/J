package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원탈퇴");

		// 조회할 회원을 불러와서 수정 시켜야 된다.
		Scanner input = new Scanner(System.in);

		System.out.println("아이디");
		String userId = input.next();

		MemberDao dao = MemberDao.getInstance();
		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("회원탈퇴 Fail!");
		} else {
			System.out.println("회원탈퇴 Success!");
		}

	}
}
