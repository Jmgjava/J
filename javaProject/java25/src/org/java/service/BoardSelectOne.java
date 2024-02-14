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
		System.out.println("�Խñ� ��ȸ");

		System.out.println("��ȣ �Է�: ");
		Scanner input = new Scanner(System.in);

		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();

		BoardDto result = dao.bselectone(no);

		if (result != null)
			System.out.print("�� ��ȣ: " + result.getNo() + " ");
		System.out.print("�� ����: " + result.getTitle() + " ");
		System.out.print("�� ����: " + result.getContent() + " ");
		System.out.print("�� �ۼ���: " + result.getWriter() + " ");
		System.out.print("�� �г���: " + result.getNickName() + " ");
	}

}
