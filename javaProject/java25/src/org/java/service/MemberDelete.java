package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDelete implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("회원삭제");

		MemberDao dao = MemberDao.getInstance();

		Scanner input = new Scanner(System.in);

		System.out.println("ID 입력");
		String userId = input.next();
		
		// 회원 아이디 유무
		int bool = dao.selectBool(userId);
		if (bool != 1) {
			System.out.println("삭제할 아이디가 존재하지 않습니다.");
			return;
		}
		

		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("회원탈퇴 실패");
		} else {
			System.out.println("회원탈퇴 성공");
		}

	}

}
