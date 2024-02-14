package org.project.service;

import java.io.IOException;
import java.sql.SQLException;

import org.project.dao.MemberDao;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("회원가입");
		
		MemberDao dao= new MemberDao();
		int rs=dao.insert();

		if (rs != 1) {
			System.out.println("회원가입 실패");
		} else {
			System.out.println("회원가입 성공");
		}

		
	}

}
