package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.memberdao.MemberDao;
import org.java.memberdto.MemberDto;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원가입");

		// DAO

		Scanner scn = new Scanner(System.in);

		System.out.println("회원번호: ");
		int no = scn.nextInt();

		System.out.println("회원Id: ");
		String userId = scn.next();

		System.out.println("회원Pw: ");
		String userPw = scn.next();

		System.out.println("회원이름: ");
		String name = scn.next();

		System.out.println("회원나이: ");
		int age = scn.nextInt();

		// 서비스에서 DB관련 시킨일을 수행, DAO
		MemberDao dao = new MemberDao();
		// DB테이블에 데이터를 저장
		int rs = dao.insert(no, userId, userPw, name, age);

		// 성공1 반환 실패 나머지값
		if (rs != 1) {
			System.out.println("회원가입 실패");
		} else {
			System.out.println("회원가입 성공");
		}
	}

}
