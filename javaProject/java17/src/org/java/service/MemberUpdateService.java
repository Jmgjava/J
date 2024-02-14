package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberUpdateService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원수정");

		MemberDao dao = new MemberDao();
		int result = dao.update();

		if (result != 1) {
			System.out.println("회원가입 실패");
		} else {
			System.out.println("회원가입 성공");
		}

	}

}
