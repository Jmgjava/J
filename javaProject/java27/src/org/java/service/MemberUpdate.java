package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberUpdate implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("회원 수정");

		Scanner input = new Scanner(System.in);

		System.out.println("수정할 회원 no입력: ");
		int no = input.nextInt();
		System.out.println("바꿀 userId입력: ");
		String userId = input.next();
		System.out.println("바꿀 userPw입력: ");
		String userPw = input.next();
		System.out.println("바꿀 age입력: ");
		int age = input.nextInt();
		System.out.println("바꿀 name입력: ");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();
		
		int has = dao.mExist(no);
		if (has != 1) {
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		}

		MemberDto insertBoard = new MemberDto(no, userId, userPw, age, name);

		int result = dao.mUpdate(insertBoard);
	}

}
