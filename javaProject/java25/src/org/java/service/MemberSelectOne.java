package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectOne implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("회원 하나만 조회");
		// 2. 조회할 아이디 선택
		System.out.println("조회할 아이디 선택");

		Scanner input = new Scanner(System.in);

		String userId = input.next();

		MemberDao dao = MemberDao.getInstance();

		MemberDto member = dao.selectone(userId);

		if (member != null) {
			System.out.print("아이디: " + member.getUserId() + " ");
			System.out.print("비밀번호: " + member.getUserPW() + " ");
			System.out.print("나이: " + member.getAge() + " ");
			System.out.print("이름: " + member.getName() + " ");
			System.out.println();
		} else {
			System.out.println("조회할 회원 없음");
		}

	}

}
