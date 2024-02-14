package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardSelectOne implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("게시글 조회");

		System.out.println("번호 입력: ");
		Scanner input = new Scanner(System.in);

		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();

		BoardDto result = dao.bselectone(no);

		if (result != null)
			System.out.print("글 번호: " + result.getNo() + " ");
		System.out.print("글 제목: " + result.getTitle() + " ");
		System.out.print("글 내용: " + result.getContent() + " ");
		System.out.print("글 작성자: " + result.getWriter() + " ");
		System.out.print("글 닉네임: " + result.getNickName() + " ");
	}

}
