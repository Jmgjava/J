package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberInsertService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("ȸ�����");

		Scanner input = new Scanner(System.in);

		System.out.println("ȸ����ȣ");// 123,,,
		int no = input.nextInt();

		System.out.println("���̵�"); // �ߺ� �Ұ���
		String userId = input.next();

		System.out.println("�����ȣ");
		String userPw = input.next();

		System.out.println("����");
		int age = input.nextInt();

		System.out.println("�̸�");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();
		// ȸ���� �ִ��� ������ ���� Ȯ�� -> UNIQUE
		// -> ���̵�� ȸ���� �̹� �ִ��� Ȯ��
		int isMember = dao.isUserIdChecked(userId);

		if (isMember == 1) {
			System.out.println("�̹� ȸ���� ���� �Ѵ�.");
			return;
		}

		// ȸ���� ���� ��� ȸ�� ���� ����
//		int result=dao.insert(new MemberDto(no, userId, userPw, age, name));
		int result = dao.insert(no, userId, userPw, age, name);

		if (result != 1) {
			System.out.println("ȸ������ Fail!");
		} else {
			System.out.println("ȸ������ Success!");
		}

	}
}
