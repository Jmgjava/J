package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardSelectOneService implements BoardSeriver{

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("게시글조회(하나)");
		// 조회할 게시글 불러와서 
		Scanner input = new Scanner(System.in);

		System.out.println("조회할 게시글 변호 ");
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();
		
		BoardDto board=dao.bSelectOne(no);
		
		if(board!=null) {
			System.out.print("글번호: " + board.getNo());
			System.out.print(", 제목: " + board.getTitle());
			System.out.print(", 내용: " + board.getContent());
			System.out.print(", 작성자: " + board.getWriter());
			System.out.println(", 닉네임: " + board.getNickName());
		}else {
			System.out.println("조회 할 게시글이 없다");
		}
		
	}
}
