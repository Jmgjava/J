package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원삭제");

		Scanner input = new Scanner(System.in);

		System.out.println("회원번호");// 123,,,
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();
		// -> 회원번호(기본키) 회원이 이미 있는지 확인
		int isMember = dao.isNoChecked(no);

		if (isMember == 0) {
			System.out.println("삭제 할 회원이 없습니다.");
			return;
//			throw new IllegalArgumentException("조회 번호가 없다");//spring boot
		}

		int result = dao.delete(no);

		if (result != 1) {
			System.out.println("회원삭제 Fail!");
		} else {
			System.out.println("회원삭제 Success!");
		}

	}
}
