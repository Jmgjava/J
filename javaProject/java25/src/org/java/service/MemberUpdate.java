package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberUpdate implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("ȸ������");

		MemberDao dao = new MemberDao();

		Scanner input = new Scanner(System.in);

		System.out.println("ID �Է�");
		String userId = input.next();
		System.out.println("Pw �Է�");
		String userPw = input.next();
		System.out.println("���� �Է�");
		int age = input.nextInt();
		System.out.println("�̸� �Է�");
		String name = input.next();
		
		// ȸ�� ���̵� ����
		int bool = dao.selectBool(userId);
		if (bool != 1) {
			System.out.println("������ ���̵� �������� �ʽ��ϴ�.");
			return;
		}

		int result = dao.update(userId, userPw, age, name);

		if (result != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}

	}

}
