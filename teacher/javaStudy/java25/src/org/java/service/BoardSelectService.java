package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;
import org.java.dto.MemberDto;

public class BoardSelectService implements BoardSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("게시글조회(목록)");

		BoardDao dao = BoardDao.getInstance();
		List<BoardDto> boards = dao.select();

		if (boards.isEmpty()) {
			System.out.println("조회할 게시글목록이 없습니다.");
		} else {
			for (BoardDto board : boards) {
				System.out.print("글번호: " + board.getNo());
				System.out.print(", 제목: " + board.getTitle());
				System.out.print(", 내용: " + board.getContent());
				System.out.print(", 작성자: " + board.getWriter());
				System.out.println(", 닉네임: " + board.getNickName());
			}
		}

	}
}
