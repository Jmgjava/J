package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardSelectOneService implements BoardSeriver{

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("�Խñ���ȸ(�ϳ�)");
		// ��ȸ�� �Խñ� �ҷ��ͼ� 
		Scanner input = new Scanner(System.in);

		System.out.println("��ȸ�� �Խñ� ��ȣ ");
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();
		
		BoardDto board=dao.bSelectOne(no);
		
		if(board!=null) {
			System.out.print("�۹�ȣ: " + board.getNo());
			System.out.print(", ����: " + board.getTitle());
			System.out.print(", ����: " + board.getContent());
			System.out.print(", �ۼ���: " + board.getWriter());
			System.out.println(", �г���: " + board.getNickName());
		}else {
			System.out.println("��ȸ �� �Խñ��� ����");
		}
		
	}
}
