package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberInsertService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원등록");

		Scanner input = new Scanner(System.in);

		System.out.println("회원번호");// 123,,,
		int no = input.nextInt();

		System.out.println("아이디"); // 중복 불가능
		String userId = input.next();

		System.out.println("비빌번호");
		String userPw = input.next();

		System.out.println("나이");
		int age = input.nextInt();

		System.out.println("이름");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();
		// 회원이 있는지 없는지 먼저 확인 -> UNIQUE
		// -> 아이디로 회원이 이미 있는지 확인
		int isMember = dao.isUserIdChecked(userId);

		if (isMember == 1) {
			System.out.println("이미 회원이 존재 한다.");
			return;
		}

		// 회원이 없을 경우 회원 가입 실행
//		int result=dao.insert(new MemberDto(no, userId, userPw, age, name));
		int result = dao.insert(no, userId, userPw, age, name);

		if (result != 1) {
			System.out.println("회원가입 Fail!");
		} else {
			System.out.println("회원가입 Success!");
		}

	}
}
