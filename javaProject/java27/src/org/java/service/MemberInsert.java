package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberInsert implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("회원 가입");

		Scanner input = new Scanner(System.in);

		System.out.println("no입력: ");
		int no = input.nextInt();
		System.out.println("userId입력: ");
		String userId = input.next();
		System.out.println("userPw입력: ");
		String userPw = input.next();
		System.out.println("age입력: ");
		int age = input.nextInt();
		System.out.println("name입력: ");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();

		int has = dao.mExist(no);
		if (has == 1) {
			System.out.println("이미 가입된 회원입니다.");
			return;
		}

		MemberDto insertBoard = new MemberDto(no, userId, userPw, age, name);

		int result = dao.mInsert(insertBoard);

	}

}
