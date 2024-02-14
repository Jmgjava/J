package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberDelete implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("회원 삭제");

		Scanner input = new Scanner(System.in);

		System.out.println("삭제할 회원 no입력: ");
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();

		int has = dao.mExist(no);
		if (has != 1) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
			return;
		}

		MemberDto insertBoard = new MemberDto(no, null, null, no, null);

		int result = dao.mDelete(insertBoard);

		if (result != 1) {
			System.out.println("삭제 실패");
		}else {
			System.out.println("삭제 성공");			
		}
	}

}
