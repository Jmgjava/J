package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {

		System.out.println("ȸ������");

		// DAO
		Scanner input = new Scanner(System.in);

		System.out.print("ȸ����ȣ: ");
		int no = input.nextInt();

		System.out.print("���̵�: ");
		String userId = input.next();

		System.out.print("�����ȣ: ");
		String userPw = input.next();

		System.out.print("�̸�: ");
		String name = input.next();

		System.out.print("����: ");
		int age = input.nextInt();

		// ���񽺿���DB���� ��Ų�� ���� DAO-><-DB
		MemberDao dao = new MemberDao();
		// DB ���̺� �����͸� ����
		int rs = dao.insert(no, userId, userPw, name, age);

		if (rs != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}

	}

}
