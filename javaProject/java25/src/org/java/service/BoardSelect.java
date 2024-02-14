package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;
import org.java.dto.MemberDto;

public class BoardSelect implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("게시글 조회");

		BoardDao dao = BoardDao.getInstance();

		List<BoardDto> result = dao.bselect();

		if (result.isEmpty()) {
			System.out.println("조회할 목록X");
		} else {
			for (BoardDto results : result) {
				System.out.print("글 번호: " + results.getNo() + " ");
				System.out.print("글 제목: " + results.getTitle() + " ");
				System.out.print("글 내용: " + results.getContent() + " ");
				System.out.print("글 작성자: " + results.getWriter() + " ");
				System.out.print("글 닉네임: " + results.getNickName() + " ");
				System.out.println();
			}
		}

	}

}
