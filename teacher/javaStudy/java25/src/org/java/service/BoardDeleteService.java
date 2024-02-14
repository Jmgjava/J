package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;

public class BoardDeleteService implements BoardSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("게시글삭제");

		// 조회할 회원을 불러와서 수정 시켜야 된다.
		Scanner input = new Scanner(System.in);

		System.out.println("삭제할 게시글 변호 ");
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();
		
		int result = dao.bDelete(no);

		if (result != 1) {
			System.out.println("게시글삭제 Fail!");
		} else {
			System.out.println("게시글삭제 Success!");
		}
	}
}
