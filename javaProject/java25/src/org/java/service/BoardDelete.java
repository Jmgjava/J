package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardDelete implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("게시글 삭제");

		Scanner input = new Scanner(System.in);

		System.out.println("no 입력:");
		int no = input.nextInt();

		BoardDao board = BoardDao.getInstance();
		int result = board.bdelete(no);
		
		if(result!=1) {
			System.out.println("삭제 실패");
		}else {
			System.out.println("삭제 성공");
		}
	}

}
