package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;

public class BoardDeleteService implements BoardSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("�Խñۻ���");

		// ��ȸ�� ȸ���� �ҷ��ͼ� ���� ���Ѿ� �ȴ�.
		Scanner input = new Scanner(System.in);

		System.out.println("������ �Խñ� ��ȣ ");
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();
		
		int result = dao.bDelete(no);

		if (result != 1) {
			System.out.println("�Խñۻ��� Fail!");
		} else {
			System.out.println("�Խñۻ��� Success!");
		}
	}
}
