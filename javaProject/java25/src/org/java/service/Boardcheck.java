package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;

public class Boardcheck implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("�Խñ� ���� Ȯ��");

		System.out.println("��ȣ�Է�: ");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();

		int result = dao.isBoard(no);

		if (result != 1) {
			System.out.println("�Խñ��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�Խñ��� �����մϴ�");
			// ��ȸ�� ���
		}

	}

}
