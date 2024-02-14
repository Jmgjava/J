package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;

import org.java.memberdao.MemberDao;
import org.java.memberdto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원조회");

		// DAO
		MemberDao dao = new MemberDao();
		MemberDto member = dao.select();

		if (member != null) {
			System.out.println("회원번호: " + member.getNo());
			System.out.println("회원Id: " + member.getUserId());
			System.out.println("회원Pw: " + member.getUserPw());
			System.out.println("회원이름: " + member.getName());
			System.out.println("회원나이: " + member.getAge());
		}
	}
}
