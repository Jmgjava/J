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
		System.out.println("�Խñ� ����");

		Scanner input = new Scanner(System.in);

		BoardDao dao = new BoardDao();

		System.out.println("no �Է�");
		int no = input.nextInt();
		System.out.println("���� �Է�");
		String title = input.next();
		System.out.println("���� �Է�");
		String content = input.next();
		System.out.println("�ۼ��� �Է�");
		String writer = input.next();
		System.out.println("�г��� �Է�");
		String nickName = input.next();

		BoardDto board = new BoardDto(no, title, content, writer, nickName);

		int result = dao.bupdate(board);
		
		if(result!=1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}

}
