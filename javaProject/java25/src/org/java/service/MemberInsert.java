package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("회원가입");

		MemberDao dao = MemberDao.getInstance();
		
		Scanner input = new Scanner(System.in);

		System.out.println("ID 입력");
		String userId = input.next();
		System.out.println("Pw 입력");
		String userPw = input.next();
		System.out.println("나이 입력");
		int age = input.nextInt();
		System.out.println("이름 입력");
		String name = input.next();

		// 회원 아이디 유무
		int bool = dao.selectBool(userId);
		if (bool == 1) {
			System.out.println("실패. 아이디가 이미 존재합니다");
			return;
		}

		int result = dao.insert(userId, userPw, age, name);

		if (result != 1) {
			System.out.println("회원가입 실패");
		} else {
			System.out.println("회원가입 성공");
		}

	}

}
