package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberUpdateService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("ȸ������");

		// ��ȸ�� ȸ���� �ҷ��ͼ� ���� ���Ѿ� �ȴ�.
		Scanner input = new Scanner(System.in);

		System.out.println("���̵�");
		String userId = input.next();

		System.out.println("�����ȣ");
		String userPw = input.next();

		System.out.println("����");
		int age = input.nextInt();

		System.out.println("�̸�");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();

		int result = dao.update(userId, userPw, age, name);

		if (result != 1) {
			System.out.println("ȸ������ Fail!");
		} else {
			System.out.println("ȸ������ Success!");
		}

	}
}
