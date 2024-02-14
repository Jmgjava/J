package org.java.service;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardUpdate implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("게시글 수정");

		Scanner input = new Scanner(System.in);

		BoardDao dao = new BoardDao();

		System.out.println("no 입력");
		int no = input.nextInt();
		System.out.println("제목 입력");
		String title = input.next();
		System.out.println("내용 입력");
		String content = input.next();
		System.out.println("작성자 입력");
		String writer = input.next();
		System.out.println("닉네임 입력");
		String nickName = input.next();

		BoardDto board = new BoardDto(no, title, content, writer, nickName);

		int result = dao.bupdate(board);
		
		if(result!=1) {
			System.out.println("수정 실패");
		}else {
			System.out.println("수정 성공");
		}
	}

}
