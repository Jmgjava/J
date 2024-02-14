package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardInsertService implements BoardSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("게시글작성");

		Scanner input = new Scanner(System.in);

		System.out.println("글번호");
		int no = input.nextInt();

		System.out.println("글제목");
		String title = input.next();

		System.out.println("글내용");
		String content = input.next();

		System.out.println("작성자");
		String writer = input.next();

		System.out.println("닉네임");
		String nickName = input.next();

		BoardDto board = new BoardDto(no, title, content, writer, nickName);

		BoardDao dao = BoardDao.getInstance();

		int result = dao.bInsert(board);

		if (result != 1) {
			System.out.println("글작성 실패");
		} else {
			System.out.println("글작성 성공");
		}

	}
}
