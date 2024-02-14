package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;

public class Boardcheck implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("게시글 유무 확인");

		System.out.println("번호입력: ");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();

		int result = dao.isBoard(no);

		if (result != 1) {
			System.out.println("게시글이 존재하지 않습니다.");
		} else {
			System.out.println("게시글이 존재합니다");
			// 조회시 사용
		}

	}

}
