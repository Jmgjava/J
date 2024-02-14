package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;

public class BoardInsert implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("�Խñ� �ۼ�");


		Scanner input = new Scanner(System.in);

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
		
		BoardDto board= new BoardDto(no, title, content, writer, nickName);

		BoardDao dao = BoardDao.getInstance();
		int result =dao.bInsert(board);
		
		if(result!=1) {
			System.out.println("���ۼ� ����");
		}else {
			System.out.println("���ۼ� ����");
		}
		
		
	}

}
