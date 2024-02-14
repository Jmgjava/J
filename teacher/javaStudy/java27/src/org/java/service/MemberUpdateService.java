package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberUpdateService implements MemberService{

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원수정");
		
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
		// -> 회원번호(기본키) 회원이 이미 있는지 확인
		int isMember = dao.isNoChecked(no);

		if (isMember == 0) {
			System.out.println("수정할 회원이 없습니다.");
			return;
		}
		// 수정할 회원이 있을 경우 회원 가입 실행		
		int result = dao.update(no, userId, userPw, age, name);

		if (result != 1) {
			System.out.println("회원수정 Fail!");
		} else {
			System.out.println("회원수정 Success!");
		}

	}
}
