package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("ȸ��Ż��");

		// ��ȸ�� ȸ���� �ҷ��ͼ� ���� ���Ѿ� �ȴ�.
		Scanner input = new Scanner(System.in);

		System.out.println("���̵�");
		String userId = input.next();

		MemberDao dao = MemberDao.getInstance();
		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("ȸ��Ż�� Fail!");
		} else {
			System.out.println("ȸ��Ż�� Success!");
		}

	}
}
